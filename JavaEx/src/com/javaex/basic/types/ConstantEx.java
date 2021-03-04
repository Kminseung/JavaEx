package com.javaex.basic.types;

public class ConstantEx {
	static final int SPEED_LIMIT = 120;
	
	public static void main(String[] args) {
		// constant: unchanging number
		// unable to change, able to declare, initialize, inquiry
		// Increasing code readability
		// unable to change is able to safe the code securing
		
		int speed = 120;
		
		boolean b1 = speed > SPEED_LIMIT;
		
		System.out.println("제한속도를 초과하였습니까? " + b1);
		
		System.out.println("제한속도는 " + SPEED_LIMIT + "km/h 입니다.");
		
		// SPEED_LIMIT = 100;		ERROR: Unable to change
	}
}
