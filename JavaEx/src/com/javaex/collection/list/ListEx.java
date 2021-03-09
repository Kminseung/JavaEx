package com.javaex.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		listClassEx();
	}
	
	private static void listClassEx() {
		// List 관련 클래스는 List 인터페이스를 구현
		//List<String> list = new LinkedList<>();		// 실체 클래스는 LinkedList
		
		List<String> list = new ArrayList<>();
		
		System.out.println("list : " + list);
		System.out.println("Size of list : " + list.size());
		
		// 객체 추가
		list.add("Java");
		list.add("C");
		list.add("C++");
		list.add("Python");
		System.out.println("list : " + list);
		
		// 객체 삽입
		list.add(2, "C#");
		System.out.println("list : " + list);
		
		// List는 중복 허용
		list.add("Java");
		System.out.println("list : " + list);
		
		// 조회
		System.out.println("2 index of list : " + list.get(2));
		
		// 루프
		for(String item : list) {
			System.out.print(item + " ");
		}
		System.out.println();
		
		// 반복자를 이용한 순회 : 권장
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String item = it.next();
			System.out.print(item + " ");
		}
		System.out.println();
		
		// 객체 삭제
		list.remove(2);
		list.remove("Python");
		System.out.println("list : " + list);
		
		// 검색
		int position = list.indexOf("Java");
		System.out.println("1st Search: : " + position);
		position = list.indexOf("Linux");		// 없는 객체의 검색
		System.out.println("1st Search: : " + position);
		
		// 비우기
		list.clear();
		System.out.println("list : " + list);
	}

}
