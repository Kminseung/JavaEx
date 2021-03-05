package com.javaex.api.practice.rectangle;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle(int w, int h) {
		width = w;
		height = h;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle rectangle = (Rectangle)obj;
			if((this.width*this.height) == (rectangle.width*rectangle.height))
				return true;
			else
				return false;
		}
		else
			return false;
	}
}
