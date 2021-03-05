package com.javaex.oop.shape.v2;

public class ShapeApp {

	public static void main(String[] args) {
		// Error! abstract class can not objectify!
		// Shape s = new Shape(10, 20);
		
		Rectangle r = new Rectangle(10, 10, 100, 50);
		Circle c = new Circle(30, 40, 10);
		Point p = new Point(10, 20);
		String s = "Triangle";
		
		drawTest(r);
		drawTest(c);
		drawTest(p);
		drawTest(s);
	}

	private static void drawTest(Object obj) {
		// obj -> draw() inside Drawable interface
		// reference type is interface, able to do casting 
		if(obj instanceof Drawable) {
			((Drawable)obj).draw();
		}
		else {
			System.out.println("Not a drawing object!");
		}
	}
}
