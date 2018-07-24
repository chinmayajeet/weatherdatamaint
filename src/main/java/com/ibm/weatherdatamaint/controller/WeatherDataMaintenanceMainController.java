package com.ibm.weatherdatamaint.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherDataMaintenanceMainController {
  
  
  @GetMapping("/")
  public String getValue
    (){
    
       return "Inside WeatherDataMaintenanceMainController";
  }
}