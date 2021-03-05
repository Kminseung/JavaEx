package com.javaex.oop.summary;

public class Human extends Animal {
	// generator
	public Human(String name) {
		super(name);
	}
	public Human(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void say() {
		System.out.printf("Hello, my name is %s.%n", name);
	}
}
