package com.setAndconInjection;

public class StudentConst {
	private String studentName;
	private int rollNum;

	public StudentConst(String studentName, int rollNum) {
		super();
		this.studentName = studentName;
		this.rollNum = rollNum;
	}

	public void disply() {
		System.out.println("welcome to the construction injection " + studentName + "\n" + rollNum + "  this is done");
	}

}
