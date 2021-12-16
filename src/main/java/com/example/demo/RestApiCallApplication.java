package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @SpringBootApplication:describes the start of spring boot project.
 *
 */
@SpringBootApplication
public class RestApiCallApplication {

	public static void main(String[] args) {
		System.out.println("Hello World From Bridgelabz");
		SpringApplication.run(RestApiCallApplication.class, args);
	}

}
