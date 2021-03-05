package com.javaex.oop.shape.v1;

// Unable to objectify
// Role to pass field and method to child class
public abstract class Shape {
	protected int x;
	protected int y;
	
	// generator
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void draw();
	public abstract double area();
}
