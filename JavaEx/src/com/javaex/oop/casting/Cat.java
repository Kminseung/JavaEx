package com.javaex.oop.casting;

public class Cat extends Animal {
	// generator
	public Cat(String name) {
		super(name);
	}
	
	// method
	public void meow() {
		System.out.println(name + " : meow~");
	}
}
