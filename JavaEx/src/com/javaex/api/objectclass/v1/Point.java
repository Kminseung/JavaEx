package com.javaex.api.objectclass.v1;

// v1. Object class
// Top level parent is Object
// when changing printing format of object -> toString override
public class Point {
	// field
	private int x;
	private int y;
	
	// generator
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return String.format("Point(x=%d, y=%d)", x, y);
	}
	
}
