package com.javaex.oop.point.v4;

// Use keyword "extends" to inheritance for object
// Top level parent is java.lang.object
public class ColorPoint extends Point {
	
	// public ColorPoint() {}
	
	// Filed
	private String color;
	
	// Generator
	public ColorPoint(int x, int y, String color) {
		super(x, y);	// Call parent's generator
		this.color = color;
	}
	
	// getter and setter
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	// draw() method inheritance from parent and Override
	// Even if overriding, parent method remains
	@Override
	public void draw() {
		super.draw();
		System.out.printf("Color Dot[x=%d, y=%d, color=%s] is drawn.%n", super.getX(), super.getY(), color);
	}
	
	// Change access restriction
	// private -> protected
	@Override
	public void draw(boolean show) {
		String message = String.format("Color Dot[x=%d, y=%d, color=%s] ", x, y, color);
		
		if(show) {
			message += "is drawn.";
		}
		else {
			message += "is erased.";
		}
		System.out.println(message);
	}
}
