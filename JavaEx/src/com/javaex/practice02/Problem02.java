package com.javaex.practice02;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		arrPrac02();
	}
	
	private static void arrPrac02() {
		int[] arr = new int[5];
		int sum = 0;
		float avg = 0;
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("i) Input Number: ");
			arr[i] = s.nextInt();
			sum += arr[i];
		}
		avg = (float)sum / (float)arr.length;
		System.out.println("AVG = " + avg);
	}
}
