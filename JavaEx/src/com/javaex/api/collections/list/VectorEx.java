package com.javaex.api.collections.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// Declare vector
		Vector<Integer> v = new Vector<>();		// Integer 객체를 담는 벡터
		System.out.println("Size : " + v.size() + ", Capacity : " + v.capacity());
		
		for(int i=1; i<v.capacity()+1; i++) {
			v.addElement(i);
		}
		System.out.println("v : " + v);
		System.out.println("Size : " + v.size() + ", Capacity : " + v.capacity());
		
		// 허용량 초과
		v.addElement(11);
		System.out.println("Size : " + v.size() + ", Capacity : " + v.capacity());
		
		// 중간 삽입
		v.insertElementAt(7, 5);
		System.out.println("v : " + v);
		
		// 객체 참조
		System.out.println("5번 인덱스의 객체 : " + v.elementAt(5));
		
		// 객체 검색
		int index = v.indexOf(6);
		System.out.println("Index of 6 : " + index);
		index = v.indexOf(0);
		System.out.println("Index of 0 : " + index);
		
		// 포함 여부
		// 내부에 10 객체 포함?
		System.out.println("v contains 10 ? : " + v.contains(10));
		
		// 객체 삭제
		System.out.println("v : " + v);
		v.removeElement(7);
		System.out.println("v : " + v);
		
		// 내부 객체를 출력 1
		for(int i=0; i<v.size(); i++) {
			Integer item = v.elementAt(i);
			System.out.print(item + " ");
		}
		System.out.println();
		
		// 내부 객체를 출력 2
		// Enhanced for
		for(Integer item : v) {
			System.out.print(item + " ");
		}
		System.out.println();
		
		// 권장! Vector -> Enumeration을 받아와 순회 -> 메모리 접근 효율이 좋음
		Enumeration<Integer> e = v.elements();
		
		while(e.hasMoreElements()) {
			Integer item = e.nextElement();
			System.out.print(item + " ");
		}
		System.out.println();
		
		// 벡터 비우기
		v.clear();
		System.out.println("v : " + v);
		System.out.printf("Size: %d, Capacity: %d%n", v.size(), v.capacity());
	}
	
}
