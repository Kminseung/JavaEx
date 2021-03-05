package com.javaex.oop.summary;

// Unable to objetify
// Able to have fields
// Able to have normal methods and abstract methods
public abstract class Animal {
	// field
	protected String name;
	protected int age;
	
	// generator
	public Animal(String name) {
		this.name = name;
	}
	public Animal(String name, int age) {
		this(name);		// Call another generator inside
		this.age = age;
	}
	
	// method
	public void eat() {
		System.out.println(name + "is eating...");
	}
	
	// Must have at least one abstract method
	public abstract void say();
}
