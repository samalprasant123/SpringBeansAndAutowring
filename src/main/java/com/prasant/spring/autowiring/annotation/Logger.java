package com.prasant.spring.autowiring.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Logger {
	
	private ConsoleWriter consoleWriter;
	
	private LogWriter fileWriter;
	
	@Inject
	@Named(value="consoleWriter")
	public void setConsoleWriter(ConsoleWriter cw) {
		this.consoleWriter = cw;
	}
	
	@Inject
	@Named(value="consoleWriter")
	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}
	
	public void writeFile(String text) {
		fileWriter.write(text);
	}
	
	public void writeConsole(String text) {
		if (consoleWriter != null)
			consoleWriter.write(text);		
	}
	
	@PostConstruct
	public void init() {
		System.out.println(this.getClass() + " constructed.");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println(this.getClass() + " destroyed.");
	}

}
