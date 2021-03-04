package com.javaex.basic.reftypes;

public class StringEx {

	public static void main(String[] args) {
		// stringTest();
		stringFormatEx();
	}
	
	private static void stringTest() {
		String str1;
		str1 = "Java";
		System.out.println("str1: " + str1);
		
		String str2 = "Java";
		System.out.println("str2: " + str2);
		
		String str3 = new String("Java");
		System.out.println("str3: " + str3);
		
		System.out.println("str1 == str2 ? " + (str1==str2));
		System.out.println("str1 == str3 ? " + (str1==str3));
		
		// Comparison of vaules : .equals()
		// Comparison of address : ==, !=
		
		System.out.println("str1's value == str2's value ? " + (str1.equals(str2)));
		System.out.println("str1's value == str3's value ? " + (str1.equals(str3)));
	}
	
	private static void stringFormatEx() {
		String fruit = "apples";
		int total = 10;
		int eat = 3;
		
		System.out.println("I ate " + eat + " out of " + total + fruit + " in total.");
		System.out.printf("I ate %d out of %d%s in total.%n", eat, total, fruit);
		
		String fmt = "I ate %d out of %d%s in total%n";
		System.out.printf(fmt, eat, total, fruit);
		System.out.printf(fmt, eat, total, "oranges");
		
		System.out.println();
		
		System.out.printf("The current interst rate is %f percent.%n", 1.25f);
		fmt = "The current interst rate is %f percent.%n";
		System.out.printf(fmt, 1.25f);
	}
}
