package com.ObjectInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
		public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			Vehicle vehicle = context.getBean("vehicle",Vehicle.class);
			vehicle.display();
			
			/*
			 * this is the object injection
			 * there are three types of injections
			 *  one is literal dependency injection
			 *  two is the object dependency injection
			 *  three is the collections dependency injection.
			 */
					
					
					
					
		}
}
