package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.demo.controllers")
public class MySpringStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringStarterApplication.class, args);
	}

}
