package com.app.raghu.rest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.raghu.bean.Book;

@RestController
@RequestMapping("/book")
public class BookRestController {

	@GetMapping("/find")
	public ResponseEntity<Book> getOneBook() {
		Book book = new Book(980, "CORE JAVA", 200.0);
		//Response Body, Http Status
		return new ResponseEntity<Book>(book, HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Book>> getAllBooks() {
		
		return new ResponseEntity<List<Book>>(
				Arrays.asList(
						new Book(980, "CORE JAVA", 200.0),
						new Book(981, "ADV JAVA", 300.0),
						new Book(982, "SPRING", 400.0),
						new Book(983, "SBMS", 500.0)
						),
				 HttpStatus.OK);
	}
	
	@GetMapping("/test")
	public ResponseEntity<Map<String,Book>> getMppedBooks() {
		
		return new ResponseEntity<Map<String,Book>>(
				Map.of(
						"B1",new Book(980, "CORE JAVA", 200.0),
						"B2",new Book(981, "ADV JAVA", 300.0),
						"B3",new Book(982, "SPRING", 400.0),
						"B4",new Book(983, "SBMS", 500.0)
						),
				 HttpStatus.OK);
	}
}
