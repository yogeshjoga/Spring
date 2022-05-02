package com.LooseCoupling;

public class Student {

	private Cheat cheat;

	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}
	public void disply() {
		System.out.println("this is the cheating.....");
		this.cheat.cheating();
	}

}
