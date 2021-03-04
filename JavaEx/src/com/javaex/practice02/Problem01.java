package com.javaex.practice02;

public class Problem01 {

	public static void main(String[] args) {
		arrPrac();
	}
	
	private static void arrPrac() {
		int[] data = {1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31};
		int count = 0;
		int sum = 0;
		
		for(int val : data) {
			if(val%3 == 0) {
				count++;
				sum += val;
			}
		}
		
		System.out.println("The number of multiples of 3 in a data array: " + count);
		System.out.println("Sum of multiples of 3 in a data array: " + sum);
	}
}
