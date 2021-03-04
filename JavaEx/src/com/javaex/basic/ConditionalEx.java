package com.javaex.basic;
import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
		// ifEx(); System.out.println("\n\n");
		// ifElseEx(); System.out.print("\n\n");
		// ifPractice(); System.out.print("\n\n");
		// switchEx(); System.out.print("\n\n");
		// switchEx2(); System.out.print("\n\n");
		// switchEx3();
		// ifPractice02();
		switchPractice();
	}
	
	private static void ifEx() {
		Scanner s = new Scanner(System.in);
		System.out.print("Input Score: ");
		int score = s.nextInt();
		
		if (score >= 60) {
			System.out.print("Pass! Congratulation!");
		}
		else {
			System.out.print("Fail!");
		}
		
		s.close();
	}
	
	private static void ifElseEx() {
		Scanner s = new Scanner(System.in);
		System.out.print("Input Number: ");
		int num = s.nextInt();
		
		if (num > 0) {
			System.out.print(num + " is positive number.");
		}
		else if(num == 0){
			System.out.print(num + " is zero.");
		}
		else {
			System.out.print(num + " is negative number.");
		}
		
		System.out.print("\n\n");
		
		if (num == 0) {
			System.out.print(num + " is zero.");
		}
		else {
			if (num > 0) { System.out.print(num + " is positive number."); }
			else { System.out.print(num + " is negative number."); }
		}
		s.close();
	}
	
	
	// ex01
	private static void ifPractice() {
		Scanner s = new Scanner(System.in);
		System.out.println("Select Course\n(1. Java 2. C 3. C++ 4. Python)");
		System.out.print("Course Number: ");
		int cno = s.nextInt();
		
		if (cno == 1) {
			System.out.print("Room is R101.");
		}
		else if (cno == 2){
			System.out.print("Room is R202.");
		}
		else if (cno == 3){
			System.out.print("Room is R303.");
		}
		else if (cno == 4){
			System.out.print("Room is R404.");
		}
		else {
			System.out.print("You can ask the counselor.");
		}
		
		s.close();
	}
	
	// switch ~ case
	private static void switchEx() {
		Scanner s = new Scanner(System.in);
		System.out.println("Select Course\n(1. Java 2. C 3. C++ 4. Python)");
		System.out.print("Course Number: ");
		int cno = s.nextInt();
		
		switch(cno) {
		case 1:
			System.out.print("Room is R101.");
			break;
		case 2:
			System.out.print("Room is R202.");
			break;
		case 3:
			System.out.print("Room is R303.");
			break;
		case 4:
			System.out.print("Room is R404.");
			break;
		default:
			System.out.print("You can ask the counselor.");
		}
		
		s.close();
	}
	
	private static void switchEx2() {
		Scanner s = new Scanner(System.in);
		System.out.print("Input month: ");
		int month = s.nextInt();
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.print(month + " month is 31th.");
			break;
		case 2:
			System.out.print(month + " month is 28th.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.print(month + " month is 30th.");
			break;
		default:
			System.out.print("Error. Plz retry!");
		}
		
		s.close();
	}
	
	private static void switchEx3() {
		Scanner s = new Scanner(System.in);
		System.out.println("Input day of week\n(MON, TUE, WED, THU, FRI, SAT, SUN)");
		String day = s.nextLine();
		
		day = day.toUpperCase();
		// Refrain from using string. Use after conversion to 'enum' type!
		switch(day) {
		case "MON":
		case "TUE":
		case "WED":
		case "THU":
			System.out.print("Study hard");
			break;
		case "FRI":
			System.out.print("Hot Friday!");
			break;
		case "SAT":
			System.out.print("Weekend!");
			break;
		case "SUN":
			System.out.print("Holiday!");
			break;
		default:
			System.out.print("Error. Plz retry!");
		}
		
		s.close();
	}
	
	// Inspection Multiplication of Three
	private static void ifPractice02() {
		Scanner s = new Scanner(System.in);
		System.out.print("Input Number: ");
		int num = s.nextInt();
		
		if ((num%3) == 0) {
			System.out.println(num + " is a multiple of 3.");
		}
		else {
			System.out.println(num + " is not a multiple of 3.");
		}
		
		// System.out.println(num + (((num%3)==0) ? " is a multiple of 3." : " is not a multiple of 3."));
		
		s.close();
	}
	
	// Rating by score
	private static void switchPractice() {
		Scanner s = new Scanner(System.in);
		System.out.print("Input Score: ");
		int score = s.nextInt();
		
		score /= 10;
		
		switch(score) {
		case 10:
		case 9:
			System.out.println("Grade is A");
			break;
		case 8:
			System.out.println("Grade is B");
			break;
		case 7:
			System.out.println("Grade is C");
			break;
		case 6:
			System.out.println("Grade is D");
			break;
		default:
			System.out.println("Grade is F");
		}
		
		s.close();
	}
}
