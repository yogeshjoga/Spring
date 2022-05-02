package com.DTO;

import java.io.Serializable;

public class StudentDTO implements Serializable {
	/**
	 * i don't know about it what happen serializable,
	 *  actually serivalizable mean to convert java supported file to network supported file.
	 */
	private static final long serialVersionUID = 1L;
	
	private int sno;
	private String sname;
	private int m1, m2, m3;

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public int getM3() {
		return m3;
	}

	public void setM3(int m3) {
		this.m3 = m3;
	}

}
