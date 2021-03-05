package com.javaex.oop.practice.phone;

public abstract class Phone {
	private String number;
	
	public Phone(String number) {
		this.number = number;
	}
	
	public String getPhoneNumber() {
		return number;
	}
	public void setPhoneNumber(String number) {
		this.number = number;
	}
	
	public abstract void call(String number);
}
