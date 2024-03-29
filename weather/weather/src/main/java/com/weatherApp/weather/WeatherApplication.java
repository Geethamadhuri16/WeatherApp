package com.weatherApp.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.weatherApp")
public class WeatherApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(WeatherApplication.class, args);
	}

}
