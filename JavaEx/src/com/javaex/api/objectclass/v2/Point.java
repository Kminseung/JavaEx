package com.javaex.api.objectclass.v2;

// v2. equals
// custom class doesn't know how to compare with internal value
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

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			// obj -> casting
			Point other = (Point)obj;
			return (this.x==other.x) && (this.y==other.y);
		}
		else
			return super.equals(obj);
	}
	
}
