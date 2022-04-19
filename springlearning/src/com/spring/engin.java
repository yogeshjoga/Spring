package com.spring;

public class engin implements Vehicle {
	public String carBrandName;
	public String bikeBrandName;
	public String busBrandName;
	public int carNumberOfCylinders;
	public int bikeNumberOfCylinders;
	public int busNumberOfCylinders;
	public double carCc;
	public double bikeCc;
	public double busCc;

	@Override
	public void car(String brandName, int numberOfCylinders, double cc) {
		this.carBrandName = brandName;
		this.carNumberOfCylinders = numberOfCylinders;
		this.carCc = cc;

	}

	@Override
	public void bike(String brandName, int numberOfCylinders, double cc) {
		this.bikeBrandName = brandName;
		this.bikeNumberOfCylinders = numberOfCylinders;
		this.bikeCc = cc;

	}

	@Override
	public void bus(String brandName, int numberOfCylinders, double cc) {
		this.bikeBrandName = brandName;
		this.bikeNumberOfCylinders = numberOfCylinders;
		this.bikeCc = cc;

	}
	
	
	public void display() {
		System.out.println("this is the car : "+this.carBrandName+" \n"+this.carNumberOfCylinders+"\n"+this.carCc);
		System.out.println("this is the bike : "+this.bikeBrandName+"\n"+this.bikeNumberOfCylinders+"\n"+this.bikeCc);
		System.out.println("this is the bus : "+this.busBrandName+"\n"+this.busNumberOfCylinders+"\n"+this.busCc);
	}

}
