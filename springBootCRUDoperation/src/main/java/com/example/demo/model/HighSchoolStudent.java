package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HighSchooolStudent")
public class HighSchoolStudent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long studentRollNum;
	@Column(name = "Student_Name")
	private String studentName;
	@Column(name = "Student_Class")
	private int studentClass;
	@Column(name = "Student_Type")
	private String studentType;
	@Column(name = "Student_Fees")
	private double studentFee;
	@Column(name = "Student_PhoneNumber")
	private long studentPh;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public long getStudentRollNum() {
		return studentRollNum;
	}

	public void setStudentRollNum(long studentRollNum) {
		this.studentRollNum = studentRollNum;
	}

	public int getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(int studentClass) {
		this.studentClass = studentClass;
	}

	public String getStudentType() {
		return studentType;
	}

	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}

	public double getStudentFee() {
		return studentFee;
	}

	public void setStudentFee(double studentFee) {
		this.studentFee = studentFee;
	}

	public long getStudentPh() {
		return studentPh;
	}

	public void setStudentPh(long studentPh) {
		this.studentPh = studentPh;
	}

}
