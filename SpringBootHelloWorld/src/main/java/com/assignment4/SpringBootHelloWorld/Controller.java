package com.assignment4.SpringBootHelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {

	@GetMapping("/hw")
	String Hello(){
		return "Hello World!";
	}
}
