package com.app.raghu.custom;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.app.raghu.bean.ErrorMessage;
import com.app.raghu.exception.StudentNotFoundException;

@RestControllerAdvice
public class CustomExceptionHandler {

	/*
	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<String> showStudentNotFound(
			StudentNotFoundException snfe
			) 
	{
		
		return  new ResponseEntity<String>(
				snfe.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	*/
	
	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<ErrorMessage> showStudentNotFound(
			StudentNotFoundException snfe
			) 
	{
		
		return new ResponseEntity<ErrorMessage>(
				new ErrorMessage(
						snfe.getMessage(), 
						"STUDENT", "NOT FOUND", 
						new Date().toString()
						),
				HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
