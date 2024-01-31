package com.weatherApp.weather.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.weatherApp.weather.Model.WeatherResponse;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {
    private final String apiKey;
    private final ObjectMapper objectMapper;

    public WeatherService(@Value("${openweathermap.apiKey}") String apiKey, ObjectMapper objectMapper) {
        this.apiKey = apiKey;
        this.objectMapper = objectMapper;
    }

    public WeatherResponse getWeatherInfo(String country, String city) {
        String apiUrl = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "," + country + "&appid=" + apiKey;
     
        try {
            // Create HttpClient
            HttpClient httpClient = HttpClient.newHttpClient();

            // Create HttpRequest
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(apiUrl))
                    .GET()
                    .build();

            // Send the request and get the response
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
           

            // Check for successful response
            if (response.statusCode() == 200) {
                WeatherResponse weatherResponse = objectMapper.readValue(response.body(), WeatherResponse.class);
                
            
               
                return weatherResponse;
            } else {
                // Handle HTTP errors
                System.out.println("HTTP Error: " + response.statusCode());
                System.out.println("Response body: " + response.body());
                throw new RuntimeException("Error fetching weather data: " + response.statusCode());
            }
        } catch (IOException | InterruptedException e) {
            // Handle exceptions
            System.out.println("Unexpected error: " + e.getMessage());
            throw new RuntimeException("Error fetching weather data", e);
        }
    }
}
