package com.javaex.basic.types;

public class FloatDoubleEx {

	public static void main(String[] args) {
		// Real number
		// float(4) < double(8)
		// byte < short < int < long < float < double
		
		float floatVar = 3.14159f;		// float type: f
		double doubleVar = 3.14159;
		
		int intVar = 30000000;
		float f1 = 3E7f;		// 3e+07
		double d1 = 314159E-5;	// 314159e-07
		
		System.out.println("int = " + intVar);
		System.out.println("float = " + f1);
		System.out.println("double = " + d1);
	}
}
