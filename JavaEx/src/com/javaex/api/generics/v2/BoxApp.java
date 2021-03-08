package com.javaex.api.generics.v2;

public class BoxApp {

	public static void main(String[] args) {
		// Generic으로 설계된 클래스는
		// new(인스턴스화)할 때 내부 데이터 타입을 지정
		GenericBox<Integer> intBox = new GenericBox<Integer>();
		GenericBox<String> strBox = new GenericBox<String>();
		
		intBox.setContent(2021);		// 컴파일러가 내부에 담길 타입을 체크
		// intBox.setContent("Java");	// 컴파일러가 티입 체크를 할 수 있어 안정성 확보 가능
		strBox.setContent("Java");
		
		int retVal = intBox.getContent();		// 캐스팅 불필요
		String retStr = strBox.getContent();
		
		System.out.println("intBox Content : " + retVal);
		System.out.println("strBox Content : " + retStr);
		
	}

}
