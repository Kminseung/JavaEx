package com.javaex.oop.point.v3;

public class PointApp {

	public static void main(String[] args) {
		Point d1 = new Point();		// default generator
		d1.setX(5);
		d1.setY(10);
		d1.draw();
		d1.draw(false);		// 	Call overloading method
		
		System.out.println();
		
		Point d2 = new Point(15, 30);		// custom generator
		d2.draw();
		d2.draw(false);		// 	Call overloading method
	}

}
