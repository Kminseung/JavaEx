package com.javaex.practice01;

public class Problem03 {

	public static void main(String[] args) {
		timesTable();
	}
	
	private static void timesTable() {
	// Times Table
		String fmt = "%d*%d=%-2d  ";
	
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++)
				System.out.printf(fmt, j, i, j*i);
			System.out.println();
		}
	}
}
