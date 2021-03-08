package com.javaex.api;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {
		arrayCopyEx();
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

		// Duplicate part of array
		target = Arrays.copyOfRange(src, 5, 12);
		System.out.println("copyOfRange : " + Arrays.toString(target));
	}
}
