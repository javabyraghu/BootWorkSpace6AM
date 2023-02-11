package com.app.raghu.exception;

@SuppressWarnings("serial")
public class StudentNotFoundException extends RuntimeException {

	public StudentNotFoundException() {
		super();
	}
	
	public StudentNotFoundException(String message) {
		super(message);
	}
}
