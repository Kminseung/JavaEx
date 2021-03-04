package com.javaex.basic;
import java.util.Scanner;

public class ConsoleEX {

	public static void main(String[] args) {
		consoleOutputEx();
		consoleInputEx();
	}
	private static void consoleInputEx() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input name: ");
		String name = scanner.next();
		
		System.out.print("Input age: ");
		int age = scanner.nextInt();
		
		System.out.println("Your name is " + name + " and age is " + age);
		
		scanner.close();
	}
	
	private static void consoleOutputEx() {
		
	}
}
