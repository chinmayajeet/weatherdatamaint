package com.ibm.weatherdatamaint.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.ibm.weatherdatamaint.controller.WeatherDataMaintenanceMainController;

@SpringBootApplication
@ComponentScan(basePackageClasses = WeatherDataMaintenanceMainController.class)
public class WeatherDataMaintenanceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherDataMaintenanceServiceApplication.class, args);
	}
	
}
