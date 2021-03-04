package com.javaex.oop.point.v4;

// v4. Inheritance
public class Point {
	protected int x;
	protected int y;
	
	// Althought undeclared "Genetator", Complier generated "Generator"
	//	public Point() { }
	
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
