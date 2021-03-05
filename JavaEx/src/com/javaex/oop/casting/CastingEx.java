package com.javaex.oop.casting;

public class CastingEx {
	public static void main(String[] args) {
		Dog d1 = new Dog("Mong");
		d1.eat();
		d1.walk();
		d1.bark();
		
		Animal d2 = new Dog("Snoopy");
		d2.eat();
		d2.walk();
		// d2.bark();		Error!
		
		// Downcasting
		((Dog)d2).bark();
	
		Animal pet = new Dog("AG");
		pet.eat();
		pet.walk();
		
		pet = null;
		
		pet = new Cat("Navi");
		pet.eat();
		pet.walk();
		
		//((Dog)pet).bark(); 		//	Error!
		// Before downcasting, varify that an instance of the same class is present!
		if(pet instanceof Dog) {
			((Dog)pet).bark();
		}
		else {
			((Cat)pet).meow();
		}
		
	}
}
