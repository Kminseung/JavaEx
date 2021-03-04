package com.javaex.oop.goods.v2.copy;

public class GoodsApp {

	public static void main(String[] args) {
		Goods notebook = new Goods();
		notebook.name = "LG Gram";
		notebook.price = 1500000;
		
		Goods smartphone = new Goods();
		smartphone.name = "iPhone SE";
		smartphone.price = 650000;
		
		System.out.printf("%s, %dwon%n", notebook.name, notebook.price);
		System.out.printf("%s, %dwon%n", smartphone.name, smartphone.price);
	}

}
