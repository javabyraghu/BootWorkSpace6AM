package com.app.raghu.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.raghu.bean.Book;

@RestController
@RequestMapping("/book")
public class BookRestController {

	@PostMapping("/save")
	public ResponseEntity<String> createBook(
			@RequestBody Book book) 
	{
		System.out.println(book);
		return new ResponseEntity<String>("DATA RECEIVED", HttpStatus.OK);	
	}
	
	@PostMapping("/all")
	public ResponseEntity<String> createMultipleBook(
			@RequestBody List<Book> books) 
	{
		System.out.println(books);
		return new ResponseEntity<String>("DATA RECEIVED#2", HttpStatus.OK);	
	}
}
