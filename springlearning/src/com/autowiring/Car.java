package com.autowiring;

public class Car {
	private String carName;
	private int  carWheels;
	
	public Car() {
		
	}
	public Car(String carName, int carWheels) {
		this();
		this.carName = carName;
		this.carWheels = carWheels;
	}
	
	public void myCar() {
		System.out.println("My car name is : "+carName+"\n my car wheels is : "+carWheels);
		
	}

}
