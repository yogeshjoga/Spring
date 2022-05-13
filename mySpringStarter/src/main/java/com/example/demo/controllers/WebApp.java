package com.example.demo.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class WebApp {
	
	@GetMapping("/")
	public String index() {
		return "welcome to the yogesh web services";
		
	}
	
	@GetMapping("/sigin")
	public String sigin() {
		return "home";
	}
	
}