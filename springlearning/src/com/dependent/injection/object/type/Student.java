package com.dependent.injection.object.type;

public class Student {
	
	private String studentName;
	private int rollNum;
	// object creation 
	private Student1 stud1;
	
	public void setStud1(Student1 stud1) {
		this.stud1 = stud1;
	}
	
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	
	public void disPlay() {
		System.out.println("Student Name is : "+studentName+"\n Student id is : "+rollNum);
		stud1.fuckingStudent();
	}
	
}
