package com.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/javanote")
public class JavaNote {
	
	@ResponseBody
	@RequestMapping("/javarough")
	public String javaRough() {
		System.out.println("Hello this is java Rough note book");
		return " This is the java Roughnote book";
	}
	
	@ResponseBody
	@RequestMapping("/hello")
	public String javaNote() {
		System.out.println("Hello this is java note Book");
		double a =10;
		double b= 30;
		double c= a*b;
		return "inside double is presented";
	}
}