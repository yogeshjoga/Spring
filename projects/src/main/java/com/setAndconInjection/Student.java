package com.setAndconInjection;

public class Student {
	private String studentName;
	private int rollNum;

	public String getStudenName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	
	public void display() {
		System.out.println(this.rollNum+"  \n" + this.studentName+"\nthis is the result");
	}

}
