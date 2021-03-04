package com.javaex.practice02;

public class Problem04 {

	public static void main(String[] args) {
		lotto();
	}

	private static void lotto() {
		int[] l = new int[45];
		
		// 1 ~ 45 Setting
		for(int i=0; i<45; i++) {
			l[i] = i+1;
		}
		
		// Shuffle
		for(int i=0; i<1000; i++) {
			int temp = 0;
			int ran = (int)(Math.random()*45);
			temp = l[0];
			l[0] = l[ran];
			l[ran] = temp;
		}
		
		for(int i=0; i<6; i++) {
			System.out.print(l[i] + "   ");
		}
		System.out.println();
	}
}
