package com.fullcycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleProjectCiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleProjectCiApplication.class, args);
		MathOperations.sum(15, 15);
	}
	
	


}
