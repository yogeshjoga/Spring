package com.ObjectInjection;

public class Bike implements Engine{

	public void engine() {
		System.out.println("Engine is not working to this bike");
		
	}

	public void petrol() {
		System.out.println("Petrol is overflow.....");
		
	}
	public void runningBike() {
		System.out.println("bike is not running due to engine is not working and petrol is overflow.....");
	}

}
