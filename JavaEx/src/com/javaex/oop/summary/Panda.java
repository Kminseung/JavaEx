package com.javaex.oop.summary;

public class Panda extends Animal {
	// generator
	public Panda(String name) {
		super(name);
	}
	public Panda(String name, int age) {
		super(name, age);
	}
	
	// Must orverride for parent method
	@Override
	public void say() {
		System.out.println(name + " : zzz~");
	}
}
