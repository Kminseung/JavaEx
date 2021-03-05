package com.javaex.oop.practice.phone;

public class Smartphone extends Phone {
	private boolean turnOn;
	
	public Smartphone(String number) {
		super(number);
	}
	public Smartphone(String number, boolean turnOn) {
		super(number);
		this.turnOn = turnOn;
	}
	
	public void turnOn() {
		turnOn = true;
	}
	public void turnOff() {
		turnOn = false;
	}
	
	public void call(String number) {
		if(turnOn == true)
			System.out.printf("Calling %s to %s......rrrrrrr%n", super.getPhoneNumber(), number);
		else
			System.out.println("The power is off. Please charge the battery.");
	}
	
	public void searchingInternet(String url) {
		System.out.println("https://" + url + "/ start searching!");
	}
}
