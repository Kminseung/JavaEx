package com.javaex.oop.staticmember;

// Keep only one instance under any situation
public class Singleton {
	// Create a single instance object in the static area
	private static Singleton instance = new Singleton();
	
	// Generator
	private Singleton() {
		// Unable to call a new
	}
	
	public static Singleton getInstance() {
		return instance;
	}
}
