package com.javaex.oop.summary;

public class KungfuPanda extends Panda implements KungfuSkill {
	// generator
	public KungfuPanda(String name) {
		super(name);
	}
	public KungfuPanda(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void kungfu() {
		// abstract method in KungfuSkill interface
		System.out.println(name + " : 아뵤~!!");
	}
}
