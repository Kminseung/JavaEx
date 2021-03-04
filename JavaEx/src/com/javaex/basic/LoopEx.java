package com.javaex.basic;
import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
		// whileEx();
		// whileGugu();
		// doWhileEx();
		// infiniteLoop();
		// forGugu();
		// continueEx();
		// breakEx();
		// nestedFor();
		// starFor();
		// nestedWhile();
		// starWhile();
		// sixRandomFor();
		sixRandomWhile();
	}

	private static void whileEx() {
		int i = 0;
		
		while(i < 5) {
			System.out.println("I like Java" + i);
			i++;
		}
	}
	
	private static void whileGugu() {
		Scanner s = new Scanner(System.in);
		System.out.print("Input dan: ");
		int dan = s.nextInt();
		int i = 1;
		
		while(i<10) {
			System.out.println(dan + " * " + i + " = " + dan*i);
			i++;
		}
		
		s.close();
	}
	
	private static void doWhileEx() {
		int num;
		int total = 0;
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.print("Input Num [zero to exit]: ");
			num = s.nextInt();
			total += num;
		} while(num != 0);
		
		System.out.println("Total = " + total);
		s.close();
	}
	
	private static void infiniteLoop() {
		while(true) {
			System.out.println("Ctrl+c to quit");
		}
	}
	
	private static void forGugu() {
		Scanner s = new Scanner(System.in);
		System.out.print("Input Dan: ");
		int dan = s.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
		s.close();
	}
	
	private static void continueEx() {
		for(int i=1; i<21; i++) {
			if((i%2)==0 || (i%3)==0)
				continue;
			System.out.println(i);
		}
	}
	
	private static void breakEx() {
		int i = 1;
		
		while(true) {
			if(i%6==0 && i%14==0) {
				System.out.println(i);
				break;
			}
			i++;
		}
	}
	
	private static void nestedFor() {
		for(int dan=2; dan<10; dan++) {
			System.out.println(dan + " Times Table");
			for(int i=1; i<10; i++)
				System.out.println(dan + " * " + i + " = " + dan*i);
			System.out.println();
		}
	}
	
	private static void starFor() {		
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	private static void nestedWhile() {
		int dan = 2;
		
		while(dan < 10) {
			System.out.println(dan + " Times Table");
			int i = 1;
			while(i < 10) {
				System.out.println(dan + " * " + i + " = " + dan*i);
				i++;
			}
			dan++;
		}
	}
	
	private static void starWhile() {
		int i = 0;
		int j;
		
		while(i < 5) {
			j = 0;
			while(j <= i) {
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println();
		}
	}
	
	private static void sixRandomFor() {
		int n;
		
		for(int i=0; i<6; i++) {
			n = (int)(Math.random()*45)+1;
			System.out.println(n);
		}
	}
	
	private static void sixRandomWhile() {
		int n;
		int i = 0;
		
		while(i < 6) {
			n = (int)(Math.random()*45)+1;
			System.out.println(n);
			i++;
		}
	}
}