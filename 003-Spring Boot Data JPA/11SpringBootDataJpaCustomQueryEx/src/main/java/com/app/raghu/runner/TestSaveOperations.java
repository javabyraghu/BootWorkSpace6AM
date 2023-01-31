package com.app.raghu.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.app.raghu.entity.Book;
import com.app.raghu.repo.BookRepository;

//@Component
public class TestSaveOperations implements CommandLineRunner {

	@Autowired
	private BookRepository repo;

	public void run(String... args) throws Exception {

		repo.saveAll(
				Arrays.asList(
						new Book(10, "Core Java",200.0, "SAM", "Backend"),
						new Book(11, "Adv Java", 300.0, "SYED", "Backend"),
						new Book(12, "Spring",400.0, "SAM", "Backend"),

						new Book(13, "HTML CSS", 100.0, "AJAY", "Frontend"), 
						new Book(14, "Bootstrap", 200.0, "SYED", "Frontend"),
						new Book(15, "ReactJS", 200.0, "AJAY", "Frontend"),
						new Book(16, "NodeJS", 300.0, "SAM", "Frontend"),
						new Book(17, "NPM Modules", 400.0, "SAM", "Frontend")
				)
		);
		
		//repo.getAllBooks().forEach(System.out::println);
		//repo.getAllBookNames().forEach(System.out::println);
		
		/*repo.getNameAndCost()
		.stream()
		.map(b -> b[0]+"-"+b[1]) //Object[] -> to -> String 
		.forEach(System.out::println);*/
	}

}
