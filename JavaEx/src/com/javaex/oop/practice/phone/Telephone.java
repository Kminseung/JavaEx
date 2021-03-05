package com.javaex.oop.practice.phone;

public class Telephone extends Phone {
	private boolean power;
	
	public Telephone(String number) {
		super(number);
	}
	public Telephone(String number, boolean power) {
		super(number);
		this.power = power;
	}
	
	public void power(boolean on) {
		power = on;
	}
	
	public void call(String number) {
		if(power == true)
			System.out.printf("Calling %s to %s......rrrrrrr%n", super.getPhoneNumber(), number);
		else
			System.out.println("The power is off. Please charge the battery.");
	}
}
