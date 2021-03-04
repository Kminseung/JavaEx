package com.javaex.oop.staticmember;

public class StaticApp {

	public static void main(String[] args) {
		// first load : static -> generator
		StaticEx s1 = new StaticEx();
		
		System.out.println("reference count: " + s1.refCount);
		System.out.println("reference count: " + StaticEx.refCount);
		
		// second load : static block is not conducted
		StaticEx s2 = new StaticEx();
		System.out.println("reference count: " + StaticEx.refCount);
		
		// free
		s1 = null;
		System.out.println("free s1");
		System.out.println("reference count: " + StaticEx.refCount);
		
		// Don't call gc arbitrarily
		System.gc();
		try {
			Thread.sleep(1000);		// Wating a second
			System.out.println("reference count: " + StaticEx.refCount);
		}
		catch(Exception e) {
			
		}
	}

}
