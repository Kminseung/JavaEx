package com.javaex.oop.shape.v2;

public class Circle extends Shape implements Drawable {
	// field
	private double r;		// radius
	
	//generator
	public Circle(int x, int y, double r) {
		super(x, y);
		this.r = r;
	}
	
	// Child class that inherit abstract class must implement parent methods
	// method
	@Override
	public void draw() {
		System.out.printf("Cirlce[x=%d, y=%d, radius=%.1f, area=%.2f] is drawn.%n", x, y, r, area());
	}

	@Override
	public double area() {
		// double area = Math.PI * Math.pow(r, 2);
		return Math.PI * Math.pow(r, 2);
	}
}
