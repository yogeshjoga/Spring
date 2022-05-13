package com.love;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Love {
	@RequestMapping("/")
	public String welcome() {
		System.out.println("code is deployed ");
		return "welcome";
		
	}

}
