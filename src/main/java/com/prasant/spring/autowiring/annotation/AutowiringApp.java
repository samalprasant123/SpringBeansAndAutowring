package com.prasant.spring.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringApp {

	public static void main(String[] args) {
		ApplicationContext context =  (ClassPathXmlApplicationContext) new ClassPathXmlApplicationContext("autowiring_annotation.xml");
		
		Logger logger = (Logger) context.getBean("logger");
		logger.writeFile("Hello Shaktimaan 123");
		logger.writeConsole("How are you?");
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
