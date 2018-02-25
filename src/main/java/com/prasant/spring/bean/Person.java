package com.prasant.spring.bean;

public class Person implements Bean {
	
	private int id;
	
	private String name;
	
	private int taxId;
	
	private Address address;
	
	public Person() {
		
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Person(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public static Person getPerson(int id, String name) {
		System.out.println("Person.getPerson()");
		return new Person(id, name);
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void speak() {
		System.out.println(this.name + " says Hello from Person.speak().");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", address=" + address + "]";
	}

	public void init() {
		System.out.println(this + " created.");
	}

	public void destroy() {
		System.out.println(this + " destroyed.");
	}
	
}
