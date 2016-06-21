# GoEuroTest-Task
Task from GoEuro

GoEuroTest-Task is a Java command line tool that takes as an input parameter a string and query the goeuro Location JSON API as mention below and create CSV file with the retrieved result.

java -jar GoEuroTest.jar "CITY_NAME"

The program takes this string and queries with it goeuro Location JSON API: The app should use this API endpoint:

http://api.goeuro.com/api/v2/position/suggest/en/CITY_NAME

Where CITY_NAME is the string that the user has entered as a parameter when calling the tool, e.g.

http://api.goeuro.com/api/v2/position/suggest/en/Berlin


Building instructions

Pre-requisite: JDK >=1.6 and Maven >=3.1

To create jar execute below command:

mvn package

Execute JAR file as follows:

java -jar target/GoEuroTest.jar Berlin

Retreived data from the goeuro endpoint will be saved in the GoEuroTest.csv file created in same folder from which jar is executed.
