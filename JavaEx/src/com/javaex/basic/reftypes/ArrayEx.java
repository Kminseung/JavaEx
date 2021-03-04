package com.javaex.basic.reftypes;

public class ArrayEx {

	public static void main(String[] args) {
		// arrayBasic();
		// twoDimens();
		// arrayCopyFor();
		arrayCopySystem();
	}

	private static void arrayBasic() {
		String[] names;
		int scores[];
		
		names = new String[] {"Hong", "Jang", "Rim", "Jeon"};
		scores = new int[4];
		
		// System.out.println(names);
		System.out.println("Length of scores: " +scores.length);
		
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 75;
		scores[3] = 95;
		// System.out.println(scores);
		
		float heights[] = {178.5f, 185.0f, 170.5f, 188.0f};
		
		for(int i=0; i<names.length; i++) {
			System.out.printf("%s (%.2f) : score = %d%n", names[i], heights[i], scores[i]);
		}
		
		int[] scores2 = scores;
		System.out.println("Are the scores and scores2 same object? : " + (scores == scores2));
		
		scores2[3] = 100;
		
		for(int i=0; i<scores.length; i++) {
			System.out.print(scores[i] + "\t");
		}
		System.out.println();
	}
	
	private static void twoDimens() {
		int[][] twoDimens = new int[5][10];
		int table[][] = {
				{1, 2, 3, 4, 5},
				{2, 3, 4, 5, 6},
				{3, 4, 5, 6, 7}
		};
		
		System.out.println("Length of table row: " +table.length);
		System.out.println("Length of table colmn: " +table[0].length);
		
		int total = 0;
		
		for(int row=0; row<table.length; row++) {
			for(int col=0; col<table[row].length; col++) {
				System.out.print(table[row][col] + "\t");
				total += table[row][col];
			}
			System.out.println();
		}
		System.out.println("Total of array: " + total);
	}
	
	private static void arrayCopyFor()  {
		int source[] = {1, 2, 3};
		int target[] = new int[10];
		
		for(int i=0; i<source.length; i++) {
			target[i] = source[i];
		}
		
		for(int i=0; i<target.length; i++) {
			System.out.print(target[i] + " ");
		}
		System.out.println();
	}
	
	private static void arrayCopySystem() {
		int source[] = {1, 2, 3};
		int target[] = new int[10];
		
		System.arraycopy(source, 0, target, 0, source.length);
		
		for(int i=0; i<target.length; i++) {
			System.out.print(target[i] + "\t");
		}
		System.out.println();
		
		for(int val : target) {
			System.out.print(val + " \t");
		}
		System.out.println();
	}
}
