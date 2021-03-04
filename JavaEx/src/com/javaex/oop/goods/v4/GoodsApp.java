package com.javaex.oop.goods.v4;

public class GoodsApp {

	public static void main(String[] args) {
		Goods notebook = new Goods("LG Gram", 1500000);
		Goods smartphone = new Goods("iPhone SE", 650000);
		
		// if changed the value maliciously or deliberately
		
		System.out.printf("%s, %dwon%n", notebook.getName(), notebook.getPrice());
		System.out.printf("%s, %dwon%n", smartphone.getName(), smartphone.getPrice());
		
		System.out.println();
		
		notebook.show();
		smartphone.show();
	}

}
