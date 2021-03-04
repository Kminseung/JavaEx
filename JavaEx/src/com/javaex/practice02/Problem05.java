package com.javaex.practice02;

public class Problem05 {

	public static void main(String[] args) {
		arrPrac04();
	}

	private static void arrPrac04() {
		int scoreboard[][] = {
				{ 80, 75, 90, 95, 78 },
				{ 92, 88, 89, 92, 70 },
				{ 78, 80, 85, 86, 63 },
				{ 83, 84, 89, 87, 75 },
				{ 89, 83, 93, 94, 78 }
				};
		int total = 0;
		int avg = 0;
		int count = 0;
		
		for(int boardRow[] : scoreboard) {
			for(int score : boardRow) {
				if(score >= 85) {
					total += score;
					count++;
				}
			}
		}
		avg = total / count;
		
		System.out.println("A total of above 85points is " + total);
		System.out.println("A average of above 85points is " + avg);
	}
}
