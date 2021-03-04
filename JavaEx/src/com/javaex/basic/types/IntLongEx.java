package com.javaex.basic.types;

// Integer data type ex
// byte(1) < short(2) < int(4) < long(8)
public class IntLongEx {

	public static void main(String[] args) {
		int intVar = 2021;
		// int intVar2 = 12345678912345;	Out of range
		
		long longVar = 2021;
		long longVar2 = 12345678912345L;	// long type
		
		short s1 = 100, s2 = 200;
		// short res = s1 + s2;		int type tranform
		
		int res = s1 + s2;
		
		System.out.println(s1 + " + " + s2 + " = " + res);
		
		
		
		
		// Binary, Octal Decimal, Hexadecimal
		int bin, oct, hex;
		
		bin = 0b1100;	// Binary: 0b
		oct = 072;		// Octal Decimal: 0
		hex = 0xFF;		// Hexadecimal: 0x
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
	}

}
