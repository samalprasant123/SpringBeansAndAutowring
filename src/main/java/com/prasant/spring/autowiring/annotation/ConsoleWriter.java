package com.prasant.spring.autowiring.annotation;

public class ConsoleWriter implements LogWriter {

	@Override
	public void write(String text) {
		System.out.println("Writing to console : " + text);
	}

}
