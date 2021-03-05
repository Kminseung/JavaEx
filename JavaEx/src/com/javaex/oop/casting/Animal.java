package com.javaex.oop.casting;

public class Animal {
	// filed
	protected String name;
	
	//generator
	public Animal(String name) {
		this.name = name;
	}
	
	// method
	public void eat() {
		System.out.println(name + " is eating.");
	}
	public void walk() {
		System.out.println(name + " is walking.");
	}
	
}
