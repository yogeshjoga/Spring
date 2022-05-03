package com.MobileService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Mobile mobile = context.getBean("mob",Mobile.class);
		mobile.display();
		/*
		 * this code was working wow 
		 * im very happy without mistakes first time it will work fine
		 */
	}

}
