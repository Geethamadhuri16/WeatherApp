package com.weatherApp.weather.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {
	 @JsonProperty("coord")
	    private Coord coord;

	    @JsonProperty("weather")
	    private Weather[] weather;

	    @JsonProperty("base")
	    private String base;

	    @JsonProperty("main")
	    private Main main;

	    @JsonProperty("visibility")
	    private int visibility;

	    @JsonProperty("wind")
	    private Wind wind;

	    @JsonProperty("clouds")
	    private Clouds clouds;

	    @JsonProperty("dt")
	    private long dt;

	    @JsonProperty("sys")
	    private Sys sys;

	    @JsonProperty("timezone")
	    private int timezone;

	    @JsonProperty("id")
	    private int id;

	    @JsonProperty("name")
	    private String name;

	    @JsonProperty("cod")
	    private int cod;

    
    public WeatherResponse() {
    	
    }

    // getters and setters

    @Override
    public String toString() {
        String weatherDescription = (weather != null && weather.length > 0) ? weather[0].getDescription() : "Weather data is null";
        String mainString = (main != null) ? main.toString() : "Main data is null";
        String sysString = (sys != null) ? sys.toString() : "Sys data is null";

        return "Weather in " + name + ": " + weatherDescription + ", " + mainString + ", " + sysString+" ,"+base;
    }
}
