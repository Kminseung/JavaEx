package com.javaex.oop.shape.v1;

public class Rectangle extends Shape{
	// field
	private int w;		// width
	private int h;		// height
	
	// generator
	public Rectangle(int x, int y, int w, int h) {
		super(x, y);
		this.w = w;
		this.h = h;
	}

	// method
	@Override
	public void draw() {
		System.out.printf("Rectangle[x=%d, y=%d, width=%d, height=%d, area=%.2f] is drawn.%n", x, y, w, h, area());
	}

	@Override
	public double area() {
		return w * h;
	}
}
