package com.javaex.api.objectclass.v2;

public class LangClassTest {

	public static void main(String[] args) {
		Point p = new Point(10, 10);
		Point p2 = new Point(10, 10);
		
		// reference type == : comparison to address
		// value comparison in reference type : .equals()
		
		System.out.println("p and p2 is same object? " + (p==p2));
		System.out.println("p and p2 have a same value? " + (p.equals(p2)));
	}
}
