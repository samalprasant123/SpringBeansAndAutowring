package com.prasant.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.prasant.spring.bean.Address;
import com.prasant.spring.bean.Person;

public class App {

	public static void main(String[] args) {		
		// ApplicationContext context =  new FileSystemXmlApplicationContext("src/main/resources/beans.xml");
		ApplicationContext context =  new ClassPathXmlApplicationContext("beans.xml");
		Person person = (Person) context.getBean("person");
		
		person.speak();
		System.out.println(person);
		
		Address address3 = (Address) context.getBean("address3");
		System.out.println(address3);
		
		//((FileSystemXmlApplicationContext) context).close();
		((ClassPathXmlApplicationContext) context).close();
	}

}
