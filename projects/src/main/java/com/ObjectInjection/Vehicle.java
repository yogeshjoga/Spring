package com.ObjectInjection;

public class Vehicle {
	
	private Car car1;
	private Bike bike1;

	


	public Car getCar1() {
		return car1;
	}

	public void setCar1(Car car1) {
		this.car1 = car1;
	}

	public Bike getBike1() {
		return bike1;
	}

	public void setBike1(Bike bike1) {
		this.bike1 = bike1;
	}
	
	public void display() {
		System.out.println("hello this is the car class");
		this.car1.engine();
		this.car1.petrol();
		this.car1.runningCar();
		System.out.println("hello this is the bike classs");
		this.bike1.engine();
		this.bike1.petrol();
		this.bike1.runningBike();
		
	}

}
