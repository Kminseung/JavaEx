package com.javaex.oop.practice.person;

public class Student extends Person {
	private String schoolName;
	
	public Student() {}
	
	public Student(String schoolName) {
		super();
		this.schoolName = schoolName;
	}
	
	public Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		// System.out.printf("Name: %s, Age: %d, School: %s%n", super.getName(), super.getAge(), schoolName);
		System.out.printf("School: %s%n", schoolName);
	}
}
