package com.javaex.basic.types;

// byte < short < int < long < float < double
public class CastingEx {
	public static void main(String[] args) {
		System.out.println("ImplictCastingEx()");
		implictCastingEx();
		
		System.out.println();
		
		System.out.println("ExplictCastingEx()");
		explictCastingEx();
	}
	
	// Explicit casting : 
	// large arrange -> small arrange : posibility of data lost
	public static void explictCastingEx() {
		double d = 1234.567;
		System.out.println(d);
		
		float f = (float)d;
		System.out.println(f);
		
		long l = (long)f;
		System.out.println(l);
		System.out.println("long to binary: " + Long.toBinaryString(l));
		
		byte b = (byte)l;
		System.out.println(b);
	}
	
	// Implicit casting : promotion
	// small arrange -> large arrange : Auto conversion in Java
	public static void implictCastingEx() {
		byte b = 25;		// 1 Byte
		System.out.println(b);
		
		short s = b;
		System.out.println(s);
		
		int i = s;
		System.out.println(i);
		
		long l = i;
		System.out.println(l);
		
		float f = l;
		System.out.println(f);
		
		double d = f;
		System.out.println(d);
	}
}
