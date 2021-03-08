package com.javaex.api.generics.v3;

public class BoxApp {

	public static void main(String[] args) {
		// Generic으로 설계된 클래스는
		// new(인스턴스화)할 때 내부 데이터 타입을 지정
		// Key타입이 String, Value 타입이 Integer
		GenericBox<String, Integer> intBox = new GenericBox();
		
		intBox.setKey("Integer");
		// intBox.setKey(123);		ERROR
		
		intBox.setContent(2021);
		//intBox.setContent("Java");		ERROR
		
		int retVal = intBox.getContent();	// 캐스팅 불필요
		System.out.println("Key : " + intBox.getKey() + " Value : " + retVal);
	}

}
