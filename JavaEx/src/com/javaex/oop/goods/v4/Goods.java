package com.javaex.oop.goods.v4;

// v4. this : Meaning of Object self
//	   this : Call another generator inside
// using with "new" and Responsible for initializing object
public class Goods {
	// public > protected > default > private
	private String name;
	private int price;
	
	// If no Generator in the code, complier adds default Generator
	// But if having a custom Generator, complier dosen't add default Generator
	
	// generator1
	public Goods(String name) {
		this.name = name;
	}
	
	// generator2
	public Goods(String name, int price) {
		this(name);
		this.price = price;
	}

	// Only getter, only read
	// Getter and Setter
	public String getName() { return name; }
	// public void setName(String name) { this.name = name; }
	
	public int getPrice() { return price; }
	// public void setPrice(int price) { this.price = price; }
	
	// Print method
	public void show() { 
		System.out.printf("Goods Name : %s, Price : %d%n", getName(), getPrice());
	}
}
