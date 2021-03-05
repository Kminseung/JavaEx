package com.javaex.api.objectclass.v3;

// v3. Shallow replication
// Create a new object with the same value
// Simply duplicate fields
public class Point implements Cloneable{
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

	// getter and setter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	// replication method
	public Point getClone() {
		// object replication
		Point clone = null;
		
		try {
			clone = (Point)clone();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clone;
	}
}
