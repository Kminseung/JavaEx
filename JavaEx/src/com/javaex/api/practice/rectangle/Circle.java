package com.javaex.api.practice.rectangle;

public class Circle {
	private int x;
	private int y;
	private int radius;
	
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Circle) {
			Circle c = (Circle)obj;
			return (this.x==c.x) && (this.y==c.y) && (this.radius==c.radius);
		}
		else {
			return super.equals(obj);
		}
	}
}
