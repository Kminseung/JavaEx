package com.javaex.oop.casting;

public class Dog extends Animal {
	// generator
		public Dog(String name) {
			super(name);
		}
		
		// method
		public void bark() {
			System.out.println(name + " : bark! bark!");
		}
}
