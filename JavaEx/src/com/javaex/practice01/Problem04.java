package com.javaex.practice01;

public class Problem04 {

	public static void main(String[] args) {
		num10();
	}
	
	private static void num10() {
		for(int i=1; i<11; i++) {
			for(int j=0; j<10; j++)
				System.out.printf("%-3d", i+j);
			System.out.println();
		}
	}
}
