package com.prasant.spring.bean;

public class Address implements Bean {
	
	private String street;
	
	private int zipcode;
	
	public Address() {
		
	}
	
	public Address(String street) {
		super();
		this.street = street;
	}

	public Address(String street, int zipcode) {
		super();
		this.street = street;
		this.zipcode = zipcode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", zipcode=" + zipcode + "]";
	}
	
	public void init() {
		System.out.println(this + " created.");
		if (this.zipcode == 0) {
			this.zipcode = 12345;
		}
	}

	public void destroy() {
		System.out.println(this + " destroyed.");
	}
	
}
