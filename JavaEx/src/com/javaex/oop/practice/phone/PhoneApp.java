package com.javaex.oop.practice.phone;

public class PhoneApp {

	public static void main(String[] args) {
		Telephone tp = new Telephone("010-1234-5678", false);
		Smartphone sp = new Smartphone("010-5678-1234", true);
		
		tp.call("010-5678-1234");
		tp.power(true);
		tp.call("010-5678-1234");
		
		System.out.println();
		
		sp.call("010-1234-5678");
		sp.turnOff();
		sp.call("010-1234-5678");
		sp.turnOn();
		sp.call("010-1234-5678");
		sp.searchingInternet("www.naver.com");
	}
}
