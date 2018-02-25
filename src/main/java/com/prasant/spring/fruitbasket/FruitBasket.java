package com.prasant.spring.fruitbasket;

import java.util.List;

public class FruitBasket {
	
	private String name;
	
	private List<String> fruits;

	public FruitBasket(String name, List<String> fruits) {
		super();
		this.name = name;
		this.fruits = fruits;
	}
	
	public void init() {
		System.out.println("FruitBasket created.");
	}
	
	public void destroy() {
		System.out.println("FruitBasket destroyed.");
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(this.name + " : contains \n");
		
		fruits.forEach(fruitName -> {
			sb.append("\t" + fruitName + "\n");
		});
		
		return sb.toString();
	}
}
