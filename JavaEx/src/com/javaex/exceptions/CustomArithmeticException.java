package com.javaex.exceptions;

public class CustomArithmeticException extends ArithmeticException {
	// field
	private int n1;
	private int n2;
	
	// generator
	public CustomArithmeticException(String message, int n1, int n2) {
		// 부모 생성자 호출
		super(message);
		
		this.n1 = n1;
		this.n2 = n2;
	}

	// getter
	public int getN1() {
		return n1;
	}
	public int getN2() {
		return n2;
	}
	
}
