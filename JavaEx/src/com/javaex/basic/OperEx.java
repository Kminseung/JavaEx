package com.javaex.basic;

public class OperEx {

	public static void main(String[] args) throws Exception {
		arithOperEx();
		
		logicalOperEx();
		
		bitOperEx();
		
		
		
		// Arithmetic Exception Ex
		System.out.println();System.out.println();System.out.println();
		int a1 = 10, a2 = 0;
		try {
			System.out.println(a1 / a2);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Error");
		}
		finally {
			System.out.println("Exception Processing Ex");
		}
	}
	
	// Arithmetic Operator
	private static void arithOperEx() {
		int a = 7;
		int b = 3;
		
		// Sign Operator: +, -
		System.out.println(-a);
		System.out.println(-1 * a);
		
		// Arithmetic Operator: +, -, *, /, %
		System.out.println(a / b);
		System.out.println(a % b);
		
		// int 7 / int 3 -> Operating result
		System.out.println((float)a / (float)b);
		System.out.println((float)a / b);		// Auto type conversion
		System.out.println();
		
		
		
		// Increasing or Decreasing Operator: ++, --
		int c = 10;
		System.out.println("Backward Operate");
		System.out.println(c);
		System.out.println(c++);
		System.out.println(c);
		System.out.println();
		
		c = 10;
		System.out.println("Front Operate");
		System.out.println(c);
		System.out.println(++c);
		System.out.println(c);
		System.out.println();
		
		
		
		System.out.println("Additional Division");
		// Additional Division
		int d = 10;
		int e = 0;
		
		// System.out.println(d / e);		Arithmetic Exception
		System.out.println((float)d / e);
		// Checking whether result is finite or infinite from operating
		System.out.println("10.0 / 0 = finite number? " + Double.isFinite((float)d / e));
		
		System.out.println(0.0 / 0.0);		// NaN(Not a Number)
		System.out.println("0.0 / 0.0 is NaN? " + Double.isNaN(0.0 / 0.0));
		
		// Operating of Infinite number : result is always infinte
		System.out.println(10.0 / 0 + 10);
		// Operating of NaN number :  result is always NaN
		System.out.println(0.0 / 0.0 + 10);
		System.out.println();
		
		
		
		// Assignment Operator
		a += b;		// equals a = a + b
	}
	
	// Comparison, Logical Operator
	public static void logicalOperEx() {
		System.out.println("Comparison Operator : ==, !=, >, >=, <. =<");
		// Comparison Operator : ==, !=, >, >=, <. =<
		int a = 3, b = 7;
		
		System.out.println("a > b ? " + (a > b));
		System.out.println("a equals b ? " + (a == b));
		System.out.println("a not equals b ? " + (a != b));
		System.out.println();
		
		
		System.out.println("Logical Operator : AND(&&), OR(||), NOT(!)");
		// Logical Operator : AND(&&), OR(||), NOT(!)
		int val = 5;
		
		// Is the val below 0 and 10?
		// 1) Is the val over 0?
		// 2) Is the val under 10?
		// 3) Is the val below 0 and 10?
		boolean r1 = val > 0;
		boolean r2 = val < 10;
		boolean r1andr2 = r1 && r2;
		System.out.println("r1 && r2 = " + r1andr2);
		
		// Is the val below 0 and above 10?
		// 1) Is the val below 0?
		// 2) Is the val above 10?
		// 3) Is the val below 0 and above 10?
		r1 = val <= 0;
		r2 = val >= 10;
		boolean r1orr2 = r1 || r2;
		System.out.println("r1 && r2 = " + r1orr2);
		
		// Is the val below 0 and above 10? Denial logical value
		boolean rNot = !r1orr2;
		System.out.println("!r1orr2 = " + rNot);
		System.out.println();
	}
	
	
	
	// Bit Operator
	public static void bitOperEx() {
		System.out.println("Bit Opertor");
		// Bit Operator(&, |, ~)
		int b1 = 0b1101;
		int b2 = 0b0111;
		
		System.out.println(Integer.toBinaryString(b1));
		System.out.println(Integer.toBinaryString(b2));
		
		int res = b1 & b2;
		System.out.println("1101 & 101 = " + Integer.toBinaryString(res));
		
		res = b1 | b2;
		System.out.println("1101 | 101 = " + Integer.toBinaryString(res));
		
		res = ~b1;
		System.out.println("~1101 = " + Integer.toBinaryString(res));
	}

}
