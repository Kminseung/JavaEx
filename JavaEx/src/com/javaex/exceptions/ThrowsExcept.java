package com.javaex.exceptions;

import java.io.IOException;

public class ThrowsExcept {
	public void executeChecked() throws IOException{
		System.err.println("강제 체크드 예외 발생");
		
		// 예외 발생
		throw new IOException("강제 예외");
		// IOException은 checked exception -> 반드시 예외 처리 필요
	}
	
	public void executeRuntime() {
		System.err.println("런타임 예외");
		throw new RuntimeException("런타임 예외");		// unchecked exception -> 예외 처리 강제 아님
	}
	
	public double divide(int n1, int n2) {
		double res;
		try {
			res = n1 / n2;
		}
		catch(ArithmeticException e) {
			// 예외 전환 : 보다 구체적인 예외로 전환
			throw new CustomArithmeticException("Custom Exception", n1, n2);
		}
		
		return res;
	}
}
