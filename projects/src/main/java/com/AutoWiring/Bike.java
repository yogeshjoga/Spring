package com.AutoWiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Bike {
	private Engine engine;
	
	/*
	 * more then 1 object(bean) in xml we can use @Qualifier annotation 
	 * to pass particular object to the arg
	 * 
	 */
	@Autowired
	@Qualifier("bullet")
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void display() {
		System.out.println("Hello");
		this.engine.vehicle();
	}
	
}
