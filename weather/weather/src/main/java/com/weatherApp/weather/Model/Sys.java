package com.weatherApp.weather.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Sys {
    @JsonProperty("type")
    private int type;

    @JsonProperty("id")
    private int id;

    @JsonProperty("country")
    private String country;

    @JsonProperty("sunrise")
    private long sunrise;

    @JsonProperty("sunset")
    private long sunset;
    
    public Sys() {
    	
    }

    // getters and setters

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getSunrise() {
        return sunrise;
    }

    public void setSunrise(long sunrise) {
        this.sunrise = sunrise;
    }

    public long getSunset() {
        return sunset;
    }

    public void setSunset(long sunset) {
        this.sunset = sunset;
    }

    @Override
    public String toString() {
        return "Sys: type=" + type + ", id=" + id + ", country=" + country + ", sunrise=" + sunrise + ", sunset=" + sunset;
    }
}
