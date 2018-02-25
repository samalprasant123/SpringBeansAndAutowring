package com.prasant.spring.autowiring.annotation;

public class FileWriter implements LogWriter {

	@Override
	public void write(String text) {
		System.out.println("Writing to file : " + text);
	}

}
