package com.spring;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserLogic {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the car specfications \n brand name \n number of Cylinders \n how much cc");
		String carBrandName = scanner.next();
		int carNumberOfCylinders = scanner.nextInt();
		double carCc = scanner.nextDouble();
		System.out.println("Enter the bike specfications \n brand name \n number of Cylinders \n how much cc");
		String bikeBrandName = scanner.next();
		int bikeNumberOfCylinders = scanner.nextInt();
		double bikeCc = scanner.nextDouble();
		System.out.println("Enter the bus specfications \n brand name \n number of cylinders \n how much cc");
		String busBrandName = scanner.next();
		int busNumberOfCylinders = scanner.nextInt();
		double busCc = scanner.nextDouble();
		
		// load the spring configuration files
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		engin en = context.getBean("myid",engin.class);
		
		
		
		// call the methods 
		en.car(carBrandName, carNumberOfCylinders, carCc);
		en.bike(bikeBrandName, bikeNumberOfCylinders, bikeCc);
		en.bus(busBrandName, busNumberOfCylinders, busCc);
		
		en.display();
		
		// close the context
		context.close();
		
		
	}

}
