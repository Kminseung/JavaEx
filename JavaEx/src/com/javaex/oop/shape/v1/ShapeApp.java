package com.javaex.oop.shape.v1;

public class ShapeApp {

	public static void main(String[] args) {
		// Error! abstract class can not objectify!
		// Shape s = new Shape(10, 20);
		
		Rectangle r = new Rectangle(10, 10, 100, 50);
		r.draw();
		
		Circle c = new Circle(30, 40, 10);
		c.draw();
	}

}
