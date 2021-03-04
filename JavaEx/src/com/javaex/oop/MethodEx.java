package com.javaex.oop;

public class MethodEx {

	public static void main(String[] args) {
		printDivide(5, 3);
		printDivide(5, 0);
		
		double result = getSum(4, 5);
		System.out.println("4 + 5 = " +result);
		
		System.out.println("getSum = " + getSum(new double[] {1, 2, 3, 4, 5 ,6 ,7 ,8 ,9, 10}));
		
		System.out.println("getSum = " + getSumMany(1, 2, 3, 4, 5));
	}

	// no return value : void
	private static void printDivide(int n1, int n2) {
		if(n2 == 0) {
			System.out.println("Unable to divide by zero");
			
			return;
		}
		System.out.println(n1 / n2);
	}
	
	// return value : specify as return type
	private static double getSum(double n1, double n2) {
		return n1 + n2;
	}
	
	// not know the number of parameters
	private static double getSum(double[] values) {
		double total = 0;
		
		for(double val : values)
			total += val;
		
		return total;
	}
	
	// Variable argument
	private static double getSumMany(double ...values) {
		double total = 0;
		
		for(double val : values)
			total += val;
		
		return total;
	}
}
