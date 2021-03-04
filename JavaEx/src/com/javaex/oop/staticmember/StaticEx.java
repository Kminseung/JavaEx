package com.javaex.oop.staticmember;

public class StaticEx {
	// class variable(static)
	//		: Share on all instances
	//		: static -> instance (x)
	//		: instance -> static (o)
	public static int refCount;
	public static String classVar;
	// instance variable
	//		: Share only whithin individual objects
	public String instanceVar;
	
	static {
		refCount = 0;
		classVar = "class variable";
		
		System.out.println("=> Static Block");
		
		// instanceVar = "instance Value";	static -> instance (x)
	}
	
	// Generator
	public StaticEx() {
		refCount++;		// instance -> static (o)
		System.out.println("=> Generate instance");
		System.out.println("=> reference count: " + refCount);
	}
	
	// Finalize
	@Override
	protected void finalize() throws Throwable {
		refCount--;
		System.out.println("Call finalize");
		super.finalize();
	}
}
