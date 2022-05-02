package com.SimProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	
	  
	  public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		 System.out.println("loaded");
//		 Airtel airtel = context.getBean("airtel",Airtel.class);
//		 airtel.calling();
//		 airtel.texting();
//		 airtel.data(); 
		 
		 // user interface we can access all the methods by using intraface
		 
		 Sim sim = context.getBean("sim",Sim.class);
		 sim.calling();
		 sim.texting();
		 sim.data();
		 
		 
		 
		 
		 
	}

}
