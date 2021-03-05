package com.javaex.api.objectclass.v1;

public class LangClassTest {

	public static void main(String[] args) {
		Point p = new Point(10, 10);
		
		// Top Level is Object Class
		System.out.println(p.getClass());	// object info of p
		System.out.println(p.getClass().getSimpleName());	// class info
		System.out.println(p.toString());	// print string of object info
		System.out.println(p);
		// toString() : print or connect to string auto output
		System.out.println(p.hashCode());
		// hashCode() : memory address of object
		
		Point p2 = new Point(10, 10);
		Point p3 = p;
		
		System.out.println("p hashcode: " + p.hashCode());
		System.out.println("p2 hashcode: " + p2.hashCode());
		System.out.println("p3 hashcode: " + p3.hashCode());
		
		System.out.println("p hashcode == p2 hashcode ? " + (p.hashCode()==p2.hashCode()));
		System.out.println("p hashcode == p3 hashcode ? " + (p.hashCode()==p3.hashCode()));
		
	}

}
