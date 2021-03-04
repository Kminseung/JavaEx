package com.javaex.oop.goods.v2;

// v2. Restrict access to filed
// Bypass access for filed to use getter and setter
public class Goods {
	// public > protected > default > private
	private String name;
	private int price;
	
	// Getter and Setter
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public int getPrice() { return price; }
	public void setPrice(int price) { this.price = price; }
	
	// Print method
	public void show() { 
		System.out.printf("Goods Name : %s, Price : %d%n", getName(), getPrice());
	}
}
