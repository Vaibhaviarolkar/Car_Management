package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManageCarApplication {
	 @Autowired
	    private CarRepository carRepository;
	 
	 
	public static void main(String[] args) {
		SpringApplication.run(ManageCarApplication.class, args);
		
	}
	
	

}
