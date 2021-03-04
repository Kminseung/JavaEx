package com.javaex.oop.point.v4;

public class PointApp {

	public static void main(String[] args) {
		Point d1 = new Point(5, 10);		// default generator
		d1.draw();
		d1.draw(false);		// 	Call overloading method
		
		System.out.println();
		
		Point d2 = new Point(15, 30);		// custom generator
		d2.draw();
		d2.draw(false);		// 	Call overloading method
		
		System.out.println();
		
		ColorPoint cp = new ColorPoint(20, 40, "Black");
		cp.draw();
		cp.draw(false);
		
		System.out.println();
		
		ColorPoint cp2 = new ColorPoint(30, 40, "Red");
		cp2.draw();
		
		System.out.println();
		
		// Parent refers to child
		Point cp3 = new ColorPoint(50, 100, "Blue");
		cp3.draw();
	}
}
