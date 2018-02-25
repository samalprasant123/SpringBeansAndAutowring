package com.prasant.spring.bean;

public class PersonFactory {

	public Person createPerson(int id, String name) {
		System.out.println("PersonFactory.createPerson()");
		return new Person(id, name);
	}
}
