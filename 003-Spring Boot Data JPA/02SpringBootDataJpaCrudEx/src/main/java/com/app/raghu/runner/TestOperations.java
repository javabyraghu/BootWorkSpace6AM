package com.app.raghu.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.raghu.entity.Book;
import com.app.raghu.exception.BookNotFoundException;
import com.app.raghu.repo.BookRepository;

@Component
public class TestOperations implements CommandLineRunner {

	@Autowired
	private BookRepository repo;

	public void run(String... args) throws Exception {
		// System.out.println(repo.getClass().getName());
		Book b1 = new Book(10, "Core Java", "SAM", 200.0);
		repo.save(b1);

		repo.save(new Book(11, "Adv Java", "SYED", 300.0));
		repo.save(new Book(12, "Spring", "SAM", 400.0)); // INSERT
		repo.save(new Book(12, "Spring 6.x", "SAM", 600.0)); // UPDATE

		repo.saveAll(Arrays.asList(
				new Book(13, "HTML CSS", "AJAY", 100.0), 
				new Book(14, "Bootstrap", "AJAY", 200.0),
				new Book(15, "ReactJS", "AJAY", 300.0)));

		Iterable<Book> data = repo.findAll();
		// data.forEach(System.out::println);
		data.forEach(b -> System.out.println(b));

		System.out.println(repo.count());

		System.out.println(repo.existsById(13));
		// =========================================
		/*
		 * Optional<Book> opt = repo.findById(140); if(opt.isPresent()) { Book b3 =
		 * opt.get(); System.out.println(b3); } else {
		 * //System.out.println("DATA NOT FOUND"); throw new
		 * BookNotFoundException("BOOK NOT EXIST WITH ID "); }
		 */

		Book b4 = repo.findById(14).orElseThrow(
				() -> new BookNotFoundException("BOOK NOT EXIST WITH ID "));
		System.out.println(b4);
		
		//===================================================
		//repo.deleteById(15);
		//repo.deleteAll();
		
		//repo.delete(b4);

	}

}
