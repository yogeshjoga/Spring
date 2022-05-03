package com.PropertyFiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Client {
	private String name;
	private String area;
	private User user;

	
    @Autowired
    @Qualifier("mobile")
	public void setUser(User user) {
		this.user = user;
	}
    public User getUser() {
		return user;
	}

	public String getName() {
		return name;
	}

	@Value("${User.name}")
	public void setName(String name) {
		this.name = name;
	}

	public String getArea() {
		return area;
	}

	@Value("${User.area}")
	public void setArea(String area) {
		this.area = area;
	}
	
	public void display() {
		System.out.print("my name is " +getName()+" my area is "+getArea()+" im taken ");
		this.user.userDeatils();
	}

}
