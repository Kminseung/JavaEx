package com.javaex.practice01;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		numberingGame();
	}

	private static void numberingGame() {
		int number = (int)(Math.random()*100 + 1);
		int num = 0;
		Scanner s = new Scanner(System.in);		
		
		System.out.println("=================================");
		System.out.println("     [Start Numbering Game!]");
		System.out.println("=================================");
		
		do {
			System.out.print("Guess me!: ");
			num = s.nextInt();
			
			if(num < number)
				System.out.println("Hint: Retry Higer!");
			else if(num == number)
				System.out.println("Bingo! Congratulation!");
			else if(num > number)
				System.out.println("Hint: Retry Lower!");
			else
				System.out.println("Error! Retry from the beginning.");
		} while(num != number);
	}
}
