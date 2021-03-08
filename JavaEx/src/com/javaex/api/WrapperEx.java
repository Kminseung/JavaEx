package com.javaex.api;

public class WrapperEx {

	public static void main(String[] args) {
		// deprecated
		Integer i = new Integer(10);
		Float f = new Float(3.14159f);
		
		// valueOf() static method
		Character c = Character.valueOf('c');
		
		// able to default string
		Integer i2 = Integer.valueOf("10");
		Float f2 = Float.valueOf("3.14159f");
		Boolean b2 = Boolean.valueOf("false");
		
		// auto boxing and auto unboxing
		Integer i3 = 10; 	// == Integer i3 = Integer.valuof(10); 
		
		// Utility method
		// parse method
		System.out.println(Integer.parseInt("-123"));
		System.out.println(Integer.parseInt("FF", 16));
		System.out.println(Integer.toBinaryString(28));
		System.out.println(Integer.toHexString(28));
		
		// Type conversion method
		double d4 = i3.doubleValue();
		System.out.println("Conversion : " + d4);

		// Wrapper class is the object too
		Integer i4 = Integer.valueOf(2021);
		Integer i5 = Integer.valueOf(2021);
		
		System.out.println("i4 == i5 ? " + (i4==i5));
		// Wrapper class == Wrapper class => Compare addresses of 2 objects
		
		// Unboxing comparison or Equal comparison for value comparison
		System.out.println("Value Comparison(Unboxing) : " + (i4.intValue()==i5.intValue()));
		System.out.println("Value Comparison(Equals) : " + (i4.equals(i5)));
	}

}
