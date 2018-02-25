package com.prasant.spring.autowiring;

import org.springframework.beans.factory.annotation.Qualifier;

public class FileWriter implements LogWriter {

	@Override
	public void write(String text) {
		System.out.println("Writing to file : " + text);
	}

}
