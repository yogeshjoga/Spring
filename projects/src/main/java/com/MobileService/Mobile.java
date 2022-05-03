package com.MobileService;

public class Mobile {
	private Service service;

	public void setService(Service service) {
		this.service = service;
	}
	
	public void display() {
		System.out.println("these are your service ...");
		this.service.services();
		
	}

}
