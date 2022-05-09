package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/roughtbook")
public class RoughBook {
	
	
	@ResponseBody
	@RequestMapping("/javanote")
	public String javaNote() {
		return "this is the java rough note book ";	
	}
	
	
	@ResponseBody
	@RequestMapping("/javarough")
	public String javaRough() {
		return "this is the java rough note book";
	}
	
	@ResponseBody
	@RequestMapping("/javamath")
	public int javaMath() {
		int a=10;
		int b=15;
		int c=0,d=0,e=0,f=0;
		c=a*b;
		d=a/b;
		e=a+b;
		f=a-b;
		return c;
	}

}
