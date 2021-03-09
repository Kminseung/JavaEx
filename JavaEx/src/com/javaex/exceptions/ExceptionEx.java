package com.javaex.exceptions;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
		//arithExceptionEx();
		// arrayExceptionEx();
		// nullPointerExceptionEx();
		throwExceptEX();
		
		System.out.println("End of code!");
	}

	private static void arithExceptionEx() {
		// 키보드로부터 정수 입력
		// 100을 입력받은 수로 나누기
		double result = 0;
		int num;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Input number : ");
		
		try {
			num = s.nextInt();
		
			result = 100 / num;
		}
		catch(InputMismatchException e) {
			System.err.println("Not a decimal");
		}
		catch(ArithmeticException e) {
			// 구체적인 예외 처리
			System.err.println("Exception happened! Do not divide to zero.");
			System.err.println("Message : " + e.getMessage());
		}
		catch(Exception e) {		// 모든 예외 처리를 위한 최상위 예외 클래스
			// 구체적인 예외 처리 후 남은 예외들
			e.printStackTrace();
		}
		finally {
			// 예외 발생 여부에 관계 없이 항상 마지막에 실행
			System.out.println("Finally");
		}
		
		System.out.println("결과 : " + result);
		
		s.close();
	}
	
	private static void arrayExceptionEx() {
		int[] intArray = new int[] {3, 6, 9};
		
		try {
			System.out.println(intArray[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Error Message : " + e.getMessage());
			System.err.println("Happening Error : " + e.getClass().getSimpleName());
		}
		finally {
		}
	}
	
	private static void nullPointerExceptionEx() {
		// 가장 흔하면서 위험한 오류
		String str = new String("Hello");
		
		str = null;
		
		try {
			System.out.println(str.toString());
		}
		catch(NullPointerException e) {
			System.err.println("Error Message : " + e.getMessage());
			System.err.println("Happening Error : " + e.getClass().getSimpleName());
		}
	}
	
	private static void throwExceptEX() {
		// 호출된 메서드 내에서 발생한 예외는 가급적 메서드 내에서 예외처리 해주는 것이 좋음
		ThrowsExcept except = new ThrowsExcept();
		
		// Checked Exception
//		try {
//			except.executeChecked();		// checked Exception
//		}
//		catch(IOException e) {
//			System.err.println("호출된 메서드에서 checked 예외 발생!");
//			System.err.println("Error Message : " + e.getMessage());
//		}
		
		// Unchecked Exception
//		try {
//			except.executeRuntime();
//		}
//		catch(RuntimeException e) {
//			// 호출된 메서드 내에서 발생한 예외를 이곳에서 위임 처리
//			System.err.println("호출된 메서드에서 unchecked 예외 발생!");
//		}
		
		try {
			except.divide(100,0);
		}
		catch(CustomArithmeticException e) {
			System.err.println("Error Message : " + e.getMessage());
			System.err.println("나누어지는 수 : " + e.getN1());
			System.err.println("나누는 수 : " + e.getN2());
		}
		catch(RuntimeException e) {
			// 호출된 메서드 내에서 발생한 예외를 이곳에서 위임 처리
			System.err.println("호출된 메서드에서 uncheked 예외 발생!");
			System.err.println("Error Message : " + e.getMessage());
		}
		catch (Exception e) {
			// 남아있을 수 있는 예외를 위해 마지막은 Exception catch
			e.printStackTrace();
		}
		finally {
			System.out.println("예외처리 완료");
		}
	}
	
}
