package com.jdbc_spring;

import org.springframework.beans.factory.annotation.Value;

public class StudentDTO {
	private String name;
	private int num;

	public String getName() {
		return name;
	}
    @Value("${StudentDAO.name}")
	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}
	
	 @Value("${StudentDAO.num}")
	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "StudentDTO [name=" + name + ", num=" + num + "]";
	}

	
}
