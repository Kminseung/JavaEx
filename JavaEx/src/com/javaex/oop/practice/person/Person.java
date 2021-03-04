package com.javaex.oop.practice.person;

public class Person {
	private String name;
	private int age;
	
	// default generator
	//public Person() {}
	
	// custom generator
	public Person(String name, int age) {
		setName(name);
		setAge(age);
	}
	
	// getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// showInfo method
	public void showInfo() {
		System.out.printf("Name: %s, Age: %d%n", name, age);
	}
}
