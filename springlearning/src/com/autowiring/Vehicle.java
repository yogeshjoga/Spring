package com.autowiring;

public class Vehicle {

	/*
	 * auto wired concept 
	 *  there are some is there in auto wired concept 
	 *  1 no/default 
	 *  2 bytype
	 *  3 byname
	 *  4 constructor
	 *  5 autodetect 
	 *  
	 *  default it means default taken autowiring.
	 *  bytype = the bytype mode injects the object dependency according to type.so property name and bean name can be different. it internally calls setter method.
	 *  byname = the name of object dependency, property name and bean name must be same. it internally calls setter method.
	 *  constructor = it calls the constructor 
	 *  
	 */
	private String carString;
	private int noOfWheels;
	private Car car;

	public Vehicle(Car car) {
		super();
		this.car = car;
	}

	public void setCarString(String carString) {
		this.carString = carString;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public void disPlay() {
		System.out.println("");
		car.myCar();
	}

}
