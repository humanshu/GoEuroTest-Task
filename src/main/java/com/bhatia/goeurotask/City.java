package com.bhatia.goeurotask;

import com.bhatia.goeurotask.GeoPosition;

/**
 * @author bhatia
 *
 */
public class City {

	private Long _id;
	private String key;
    private String name;
    private String fullName;
    private String iata_airport_code;
    private String type;
    private String country;
    private GeoPosition geo_position;
    private Long locationId;
    private boolean inEurope;
    private String countryCode;
    private boolean coreCountry;
    private String distance;
	
    public City() {}
	
		
    /**
	 * @return the _id
	 */
	public Long get_id() {
		return _id;
	}

	/**
	 * @param _id the _id to set
	 */
	public void set_id(Long _id) {
		this._id = _id;
	}

	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @return the iata_airport_code
	 */
	public String getIata_airport_code() {
		return iata_airport_code;
	}

	/**
	 * @param iata_airport_code the iata_airport_code to set
	 */
	public void setIata_airport_code(String iata_airport_code) {
		this.iata_airport_code = iata_airport_code;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the geo_position
	 */
	public GeoPosition getGeo_position() {
		return geo_position;
	}

	/**
	 * @param geo_position the geo_position to set
	 */
	public void setGeo_position(GeoPosition geo_position) {
		this.geo_position = geo_position;
	}

	/**
	 * @return the locationId
	 */
	public Long getLocationId() {
		return locationId;
	}

	/**
	 * @param locationId the locationId to set
	 */
	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	/**
	 * @return the inEurope
	 */
	public boolean isInEurope() {
		return inEurope;
	}

	/**
	 * @param inEurope the inEurope to set
	 */
	public void setInEurope(boolean inEurope) {
		this.inEurope = inEurope;
	}

	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * @param countryCode the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * @return the coreCountry
	 */
	public boolean isCoreCountry() {
		return coreCountry;
	}

	/**
	 * @param coreCountry the coreCountry to set
	 */
	public void setCoreCountry(boolean coreCountry) {
		this.coreCountry = coreCountry;
	}

	/**
	 * @return the distance
	 */
	public String getDistance() {
		return distance;
	}

	/**
	 * @param distance the distance to set
	 */
	public void setDistance(String distance) {
		this.distance = distance;
	}


    
  
    
}
