package com.spring;

public class MyApp implements Piston {

	@Override
	public String size() {
		System.out.println("this is the piston interaface method");
		return "pistion";
	}

}
