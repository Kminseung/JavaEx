package com.javaex.oop.point.v2;

// v2. Generator
public class Point {
	private int x;
	private int y;
	
	// Althought undeclared "Genetator", Complier generated "Generator"
	public Point() { System.out.println("Default Generator"); }
	
	public Point(int x, int y) { 
		this.x = x;
		this.y = y;
		System.out.println("Custom Generator");
	}
	
	public int getX() { return x; }
	public void setX(int x) { this.x = x; }
	
	public int getY() { return y; }
	public void setY(int y) { this.y = y; }
	
	public void show() {
		System.out.printf("Spot[x=%d, y=%d] is drawn%n", x, y);
	}
}
