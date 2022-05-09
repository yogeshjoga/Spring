package com.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestBook {
	
	@ResponseBody
	@RequestMapping("/testbook")
	public String testbook() {
		System.out.println("Hello this is the testbook ......");
		return "hi im testbook from java class";
		
	}

}