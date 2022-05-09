package com.controllor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TestBookControllor {
	
	@ResponseBody
	@RequestMapping("/testbook")
	public String testBook() {
		System.out.println(" Hello this is yogesh joga darling ");
		return " Hello this is the testbook ";
	}
}