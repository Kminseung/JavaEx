package com.javaex.practice01;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		numTree();
	}
	
	private static void numTree() {
		Scanner s = new Scanner(System.in);
		System.out.print("Input number: ");
		int num = s.nextInt();
		
		for(int i=1; i<num+1; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		s.close();
	}
}
