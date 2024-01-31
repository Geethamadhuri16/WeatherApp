package com.weatherApp.weather.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Coord {
    @JsonProperty("lon")
    private double longitude;

    @JsonProperty("lat")
    private double latitude;
    
    public Coord() {
    	
    }

    // getters and setters

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "Coord: lon=" + longitude + ", lat=" + latitude;
    }
}
