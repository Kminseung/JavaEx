package com.javaex.api.generics.v1;

public class BoxApp {

	public static void main(String[] args) {
		IntBox intBox = new IntBox();
		intBox.setContent(2021);
		
		int retVal = intBox.getContent();
		System.out.println("Content : " + retVal);
		
		StringBox srtBox = new StringBox();
		srtBox.setContent("Java");
		
		String strVal = srtBox.getContent();
		System.out.println("Content : " + strVal);
		
		ObjectBox objBox = new ObjectBox();
		objBox.setContent(2021);
		
		ObjectBox objBox2 = new ObjectBox();
		objBox2.setContent("Java");
		
		// 내부 데이터가 Object에서 Java 컴파일러 체크가 힘들어짐
		// 데이터를 불러올 때 캐스팅 필요 -> 불편, 위험
		Integer retVal2 = (Integer)objBox.getContent();
	}

}
