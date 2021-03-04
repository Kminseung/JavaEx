package com.javaex.oop.point.v3;

//v3. method overloading
//same name but different parameter types and order
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
	
	public void draw() {
		System.out.printf("Dot[x=%d, y=%d] is drawn.%n", x, y);
	}
	
	public void draw(boolean show) {
		String message = String.format("Dot[x=%d, y=%d] ", x, y);
		
		if(show) {
			message += "is drawn.";
		}
		else {
			message += "is erased.";
		}
		System.out.println(message);
	}
}
