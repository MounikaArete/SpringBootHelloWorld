package com.assignment4.SpringBootHelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) {
		System.setProperty("server.port","1234");
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
		}
	
}


