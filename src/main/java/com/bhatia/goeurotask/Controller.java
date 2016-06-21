package com.bhatia.goeurotask;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.List;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import com.bhatia.goeurotask.City;

/**
 * @author bhatia
 *
 */
public class Controller  implements CommandLineRunner {
	    private final String endpointLink = "http://api.goeuro.com/api/v2/position/suggest/en/";
	    /**
	     * Write JSON retrieved data to the CSV file
	     * 
	     * @param retrievedData received JSON data as list of cities
	     * @throws IOException
	     * @throws NoResultFoundException 
	     */
	    private void csvFileWriter (List<City> retrievedData) throws IOException, NoResultFoundException {

	    	Writer writer = null;
	    	try {
	            // Create output file
	            File outputFile = new File("GoEuroTest.csv");	            
	            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFile), "UTF-8"));	        
	            if (retrievedData.isEmpty()) {	            	
	            	writer.write("No result found!");
	                throw new NoResultFoundException("No result found, exiting application!");
	            }            
	            writer.write("ID, NAME, TYPE, LATITUDE, LONGITUDE \n");
	            StringBuffer outputRow = new StringBuffer();
	            //Creating outputString for CSV file
	            for (int i = 0; i < retrievedData.size(); i++) {
	                 outputRow.append(retrievedData.get(i).get_id().toString()).append(", ")
	                 .append(retrievedData.get(i).getName()).append(", ")
	                 .append(retrievedData.get(i).getType()).append(", ")
	                 .append(retrievedData.get(i).getGeo_position().getLatitude().toString()).append( ", ")
	                 .append(retrievedData.get(i).getGeo_position().getLongitude().toString()).append("\n");
	             }
	            writer.write(outputRow.toString());
	            			
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            writer.close();
	        }
	    }	
	    
	    /**
	     * Run Spring Application.
	     * 
	     * @param args command line arguments
	     * @throws Exception if application fails at start
	     */
	    public void run(String... args) throws Exception {
	    	//http request handler
            RestTemplate restTemplate = new RestTemplate();            
            List<City> retreivedData = Arrays.asList(restTemplate.getForObject(endpointLink.concat(args[0]), City[].class));	               
            this.csvFileWriter(retreivedData);
	    }
	    
	    /**
	     * Application starting point.
	     * 
	     * @param args command line arguments
	     * @throws Exception if application fails at start
	     */
	    public static void main(String args[]) throws Exception {
	    	// check input arguments	    	 
	        if (args != null && args.length != 0 && args[0] != null && !args[0].isEmpty()) {  				       	        
	            String input = args[0].trim();	   
	            SpringApplication.run(Controller.class, input); 
	        }
	        else {
	        	throw new IllegalArgumentException("Please enter city name to proceed.");
	        }
	    }	     
}
