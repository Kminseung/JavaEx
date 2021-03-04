package com.javaex.oop.goods.v2;

public class GoodsApp {

	public static void main(String[] args) {
		Goods notebook = new Goods();
		notebook.setName("LG Gram");
		notebook.setPrice(1500000);
		
		Goods smartphone = new Goods();
		smartphone.setName("iPhone SE");
		smartphone.setPrice(650000);
		
		System.out.printf("%s, %dwon%n", notebook.getName(), notebook.getPrice());
		System.out.printf("%s, %dwon%n", smartphone.getName(), smartphone.getPrice());
		
		System.out.println();
		
		notebook.show();
		smartphone.show();
	}

}
