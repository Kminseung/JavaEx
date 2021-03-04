package com.javaex.oop.point.v1;

public class Point {
	private int x;
	private int y;
	
	// Althought undeclared "Genetator", Complier generated "Generator"
	public int getX() { return x; }
	public void setX(int x) { this.x = x; }
	
	public int getY() { return y; }
	public void setY(int y) { this.y = y; }
	
	public void show() {
		System.out.printf("Spot[x=%d, y=%d] is drawn%n", x, y);
	}
}
