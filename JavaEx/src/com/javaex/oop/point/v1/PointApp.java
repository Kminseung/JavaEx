package com.javaex.oop.point.v1;

public class PointApp {

	public static void main(String[] args) {
		Point d1 = new Point();
		
		d1.setX(10);
		d1.setY(10);
		
		System.out.printf("Spot[x=%d, y=%d] is drawn%n", d1.getX(), d1.getY());
		d1.show();
		
		
		Point d2 = new Point();
		d2.setX(10);
		d2.setY(10);
		
		System.out.printf("Spot[x=%d, y=%d] is drawn%n", d2.getX(), d2.getY());
		d2.show();
	}

}
