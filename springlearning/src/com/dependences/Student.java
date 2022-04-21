package com.dependences;

public class Student {
	
	
	private String studentName;
	private int rollNum;
	private String studentName1;
	private int rollNum1;
	
	public Student(String studentName1, int rollNum1) {
		super();
		this.studentName1 = studentName1;
		this.rollNum1 = rollNum1;
		
		System.out.println("this is from Student consturctor \n the name of the student is  : "+studentName1+"\n the roll num of student is : "+rollNum1);
	}

	
	
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	
	public void disPlay() {
		System.out.println("Student Name is : "+studentName+"\n Student id is : "+rollNum);
	}
	
}
