package com.javaex.practice02;

public class Problem03 {

	public static void main(String[] args) {
		arrPrac03();
	}

	private static void arrPrac03() {
		char cc[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		
		for(char c : cc) {
			System.out.print(c);
		}
		System.out.println();
		for(char c : cc) {
			if(c == ' ')
				c = ',';
			System.out.print(c);
		}
		System.out.println();
	}
}
