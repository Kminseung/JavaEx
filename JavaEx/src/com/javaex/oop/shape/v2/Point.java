package com.javaex.oop.shape.v2;

public class Point implements Drawable {
	// field
	private int x;
	private int y;
	
	// generator
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		System.out.printf("Dot[x=%d, y=%d] is drawn.%n", x, y);
	}
}
