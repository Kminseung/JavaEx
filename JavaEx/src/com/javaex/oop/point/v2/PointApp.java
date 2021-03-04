package com.javaex.oop.point.v2;

public class PointApp {

	public static void main(String[] args) {
		Point d1 = new Point();		// default generator
		d1.setX(10);
		d1.setY(10);
		d1.show();
		
		System.out.println();
		
		Point d2 = new Point(15, 30);		// custom generator
		d2.show();
	}

}
