package com.weatherApp.weather.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.weatherApp.weather.Model.WeatherResponse;
import com.weatherApp.weather.Service.WeatherService;
@RestController
public class WeatherController {
	@Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public WeatherResponse getWeatherInfo(@RequestParam String country, @RequestParam String city) {
        return weatherService.getWeatherInfo(country, city);
    }

}
