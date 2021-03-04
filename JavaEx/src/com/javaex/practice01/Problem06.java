package com.javaex.practice01;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		evenOddSum();
	}
	
	private static void evenOddSum() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Input number: ");
		int num = s.nextInt();
		
		int sum = 0;
		
		if(num%2 == 0) {		// even number
			for(int n=1; n<num+1; n++) {
				if(n%2 == 0) { sum += n; }
			}
		}
		else {					// odd number
			for(int n=1; n<num+1; n++) {
				if(n%2 == 1) { sum += n; }
			}
		}
		
		System.out.println("Sum = " + sum);
	}
}
