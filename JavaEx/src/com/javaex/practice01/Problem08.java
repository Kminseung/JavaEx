package com.javaex.practice01;

import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {
		bankSystem();
	}

	private static void bankSystem() {
		int deposit = 0;
		int withdrawal = 0;
		int balance = 0;
		int i = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("-------------------------------------------------");
		System.out.println("1. Depost | 2. Withdrawal | 3. Balance | 4. Exit");
		System.out.println("-------------------------------------------------");
		
		do {
			System.out.print("Select Transaction : ");
			i = s.nextInt();
			switch(i) {
			case 1:
				System.out.print("Deposit Amount : ");
				deposit = s.nextInt();
				balance += deposit;
				continue;
			case 2: 
				System.out.print("Deposit Amount : ");
				withdrawal = s.nextInt();
				if(withdrawal > balance) {
					System.out.println("You don't have enough balance. Retry!");
					continue;
				}
				else
					balance -= withdrawal;
				continue;
			case 3:
				System.out.println("Total Balance : " + balance);
				continue;
			case 4:
				System.out.println("Thank you for using it. Good Bye!");
				break;
			default:
				System.out.println("Input Error! Retry!");
				continue;
			}
		} while(i != 4);
	}

}
