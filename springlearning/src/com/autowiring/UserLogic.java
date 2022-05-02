package com.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserLogic {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car car = context.getBean("Car",Car.class);
		car.myCar();

	}

}
