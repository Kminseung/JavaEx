package com.javaex.api;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraysEx {

	public static void main(String[] args) {
		// arrayCopyEx();
		// basicSortAsc();
		// basicSortDesc();
		// customClassSort();
		// basicSerach();
		customClassSearch();
	}

	private static void arrayCopyEx() {
		char[] src = "Java Programming".toCharArray();
		System.out.println("Origin : " + Arrays.toString(src));

		char target[] = new char[src.length];
		System.arraycopy(src, 0, target, 0, src.length);
		System.out.println("Copy to use System : " + Arrays.toString(target));

		// Duplicate Array with Arrays Class
		target = Arrays.copyOf(src, src.length);
		System.out.println("copyOf : " + Arrays.toString(target));

		// Duplicate part of array of basic data type
		target = Arrays.copyOfRange(src, 5, 12);
		System.out.println("copyOfRange : " + Arrays.toString(target));
	}
	
	// Ascending Sorting
	private static void basicSortAsc() {
		int[] scores = {80, 50, 30, 90, 75, 88, 77};
		System.out.println("Origin : " + Arrays.toString(scores));
		
		Arrays.sort(scores);
		System.out.println("Asc sort : " + Arrays.toString(scores));
	}
	
	// Descending Sorting of basic data type
	private static void basicSortDesc() {
		Integer[] scores = {80, 50, 30, 90, 75, 88, 77};
		System.out.println("Origin : " + Arrays.toString(scores));
		
		Arrays.sort(scores, Collections.reverseOrder());
		System.out.println("Desc sort : " + Arrays.toString(scores));
	}
	
	// Custom Class Sorting
	private static void customClassSort() {
		Member[] members = { new Member("hong"),
				new Member("jang"),
				new Member("jeon")
		};
		System.out.print("Origin : " + Arrays.toString(members));
		System.out.println();
		
		Arrays.sort(members);
		System.out.println("Asc Sorting : " + Arrays.toString(members));
		
		Arrays.sort(members, Collections.reverseOrder());
		System.out.println("Desc Sorting : " + Arrays.toString(members));
	}
	
	private static void basicSerach() {
		int[] nums = { 5, 8, 1, 3, 6, 9, 10, 5, 8, 2};
		System.out.println("Origin : " + Arrays.toString(nums));
		Arrays.sort(nums);
		System.out.println("Sorting : " + Arrays.toString(nums));
		
		int index = Arrays.binarySearch(nums, 9);
		System.out.println("Index of 9 : " + index);
		
		String[] words = {"Java", "C", "C++", "Python", "Linux"};
		System.out.println("Origin : " + Arrays.toString(words));
		Arrays.sort(words);
		System.out.println("Sorting : " + Arrays.toString(words));
		
		index = Arrays.binarySearch(words, "Java");
		System.out.println("Index of Java : " + index);
	}
	
	// Custom Class Search
	private static void customClassSearch() {
		Member[] members = {
				new Member("hong"),
				new Member("jang"),
				new Member("jeon")
		};
		
		Arrays.sort(members);
		System.out.println("Origin : " + Arrays.toString(members));
		
		int index = Arrays.binarySearch(members, new Member("hong"), new Comparator<Member>() {
			public int compare(Member o1, Member o2) {
				return o1.name.compareTo(o2.name);
			}
		});
		System.out.println("Searching hong : " + index);
	}
	
}
