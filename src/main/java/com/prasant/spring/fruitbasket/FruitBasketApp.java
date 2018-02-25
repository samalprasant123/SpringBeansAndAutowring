package com.prasant.spring.fruitbasket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FruitBasketApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("fruitBasketBean.xml");
		
		FruitBasket fruitBasket = (FruitBasket) context.getBean("fruitBasket");
		System.out.println(fruitBasket);
		
		((ClassPathXmlApplicationContext)context).close();
	}
	
}
