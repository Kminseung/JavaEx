package com.javaex.practice01;

public class Problem01 {

	public static void main(String[] args) {
		multiple5and7();
	}
	private static void multiple5and7() {
		System.out.println("Multiples of 5 and 7");
		
		for(int i=1; i<101; i++)
			if(i%5==0 && i%7==0)
				System.out.println(i);
	}
}
