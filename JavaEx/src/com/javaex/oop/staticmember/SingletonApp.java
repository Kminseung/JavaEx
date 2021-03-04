package com.javaex.oop.staticmember;

public class SingletonApp {
	public static void main(String[] args) {
		// Singleton s1 = new Singleton();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println("s1 -> " + s1);
		System.out.println("s2 -> " + s2);
		
		System.out.println("s1 and s2 are same object? -> " + (s1 == s2));
	}
}
