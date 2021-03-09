package com.javaex.collection.hash;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		basicHashSetEx();
	}
	
	private static void basicHashSetEx() {
		HashSet<String> hs = new HashSet<>();
		
		System.out.println("HashSet : " + hs);
		
		// 요소 추가
		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Python");
		System.out.println("HashSet : " + hs);		// 순서 유지 X
		System.out.println("요소의 수 : " + hs.size());
		
		hs.add("Java");
		System.out.println("HashSet : " + hs);		// 중복 허용 X
		
		// 요소의 포함 여부
		System.out.println("Contains Java? " + hs.contains("Java"));
		System.out.println("Contains Linux? " + hs.contains("Linux"));
		
		System.out.println("HashSet : " + hs);
		
		// 요소 삭제
		hs.remove("C++");
		System.out.println("HashSet : " + hs);
		
		// 비우기
		hs.clear();
		System.out.println("HashSet : " + hs);
	}

}
