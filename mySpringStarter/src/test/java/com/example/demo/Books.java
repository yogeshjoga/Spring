package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Books {
	
	@GetMapping("/book")
	public String book() {
		System.out.println("this is the books in mySpringStarter");
		return "Get the books dear";
	}

}