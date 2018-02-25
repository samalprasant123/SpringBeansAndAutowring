package com.prasant.spring.autowiring;

public class Logger {
	
	//private FileWriter fileWriter;
	private LogWriter fileWriter;
	
	private LogWriter consoleWriter;
	
	public Logger() {
		super();
	}

	public Logger(FileWriter fileWriter, ConsoleWriter consoleWriter) {
		super();
		this.fileWriter = fileWriter;
		this.consoleWriter = consoleWriter;
	}

	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public void setConsoleWriter(LogWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}
	
	public void writeFile(String text) {
		fileWriter.write(text);
	}
	
	public void writeConsole(String text) {
		consoleWriter.write(text);
	}

}
