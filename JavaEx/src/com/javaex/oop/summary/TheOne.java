package com.javaex.oop.summary;

// inheritance is not possible to implement multiple
// interface is possible to implement multiple 
public class TheOne extends Human implements Flyable, KungfuSkill {
	// generator
	public TheOne(String name) {
		super(name);
	}
	public TheOne(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void fly() {
		System.out.println(name + " : I believe i can fly");
	}
	@Override
	public void kungfu() {
		System.out.println(name + " : I know kungfu!");
	}
}
