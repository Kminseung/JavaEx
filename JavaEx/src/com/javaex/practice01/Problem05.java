package com.javaex.practice01;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		// searchingMax();
		searchingMax02();
	}

	private static void searchingMax() {
	// Searching Max Value
		int max;
		Scanner s = new Scanner(System.in);
		int[] n = new int[5];
				
		for(int i=0; i<5; i++) {
			System.out.print("Input number: ");
			n[i] = s.nextInt();
		}
				
		max = n[0];
		for(int i=1; i<5; i++) {
			if(max < n[i]) {
				max = n[i];
			}
		}
		System.out.printf("Max value is %d.%n", max);
		
		s.close();
	}
	
	private static void searchingMax02() {
		// Searching Max Value
			int max = 0;
			
			Scanner s = new Scanner(System.in);
			for(int i=0; i<5; i++) {
				System.out.printf("%d) Input number: ", i+1);
				int num = s.nextInt();
				if(max < num) {
					max = num;
				}
			}
			
			System.out.printf("Max value is %d.%n", max);
			
			s.close();
	}
}
