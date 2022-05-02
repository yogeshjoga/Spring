package com.ObjectInjection;

public class Car implements Engine {

	public void engine() {
		System.out.println("Engine is working");
		
	}

	public void petrol() {
		System.out.println("Petrol tank full...");
		
	}
	public void runningCar() {
		System.out.println("Car started and running");
	}

}
