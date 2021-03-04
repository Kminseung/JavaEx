package com.javaex.basic.types;

public class VarEx {
	public static void main(String[] args) {
		// 변수, 식별자는 문자, 숫자, $, _ 조합으로 이루어짐
		// 숫자가 변수, 식별자명 맨 앞에 올 수 없음
		// 예약어 사용 불가
		
		int myAge;
		myAge = 5;
		
		// 한 번 선언된 변수 타입은 변경 불가
		System.out.println("내 나이는 = " + myAge);
		
		int v1 = 20, v2 = 30, v3 = 40;
		
		v1 = v2 = v3 = 50;
		System.out.println("v1= " + v1 + ", v2= " + v2 +", v3= " + v3);
	}
}
