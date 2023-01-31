package com.app.raghu.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Component;

import com.app.raghu.entity.Book;
import com.app.raghu.repo.BookRepository;

@Component
public class TestOperations implements CommandLineRunner {

	@Autowired
	private BookRepository repo;

	public void run(String... args) throws Exception {

		repo.saveAll(
				Arrays.asList(
							new Book(10, "Core Java", "SAM", 200.0),
							new Book(11, "Adv Java", "SYED", 300.0),
							new Book(12, "Spring", "SAM", 400.0),

							new Book(13, "HTML CSS", "AJAY", 100.0), 
							new Book(14, "Bootstrap", "AJAY", 200.0),
							new Book(15, "ReactJS", "AJAY", 300.0),
							new Book(16, "NodeJS", "SAM", 400.0),
							new Book(17, "NPM Modules", "SAM", 100.0)
				)
		);
		
		//repo.findAll().forEach(System.out::println);
		//-------------------------------------------//
		//**  1. SINGLE COLUMN SORTING - ASC     **  //
		//-------------------------------------------//
		//order by bcost ASC;
		//Sort s1 = Sort.by(Direction.ASC, "bookCost");
		Sort s1 = Sort.by("bookCost");
		
		Iterable<Book> it1 = repo.findAll(s1);
		it1.forEach(System.out::println);
		
		//-------------------------------------------//
		//**  2. SINGLE COLUMN SORTING - DESC    **  //
		//-------------------------------------------//
		//order by bcost DESC;
		Sort s2 = Sort.by(Direction.DESC, "bookCost");
		repo.findAll(s2).forEach(System.out::println);
		
		//-----------------------------------------------------------------//
		//**  3. MULTI-COLUMN SORTING - SAM TYPE (Both ASC/Both DESC)  **  //
		//-----------------------------------------------------------------//
		//Sort s3 = Sort.by(Direction.ASC, "bookCost", "bookName");
		Sort s3 = Sort.by(Direction.DESC, "bookCost", "bookName");
		repo.findAll(s3).forEach(System.out::println);
		
		
		//-----------------------------------------------------------//
		//**  4. MULTI-COLUMN SORTING -MIXED TYPE ( ASC +  DESC) **  //
		//-----------------------------------------------------------//
		//1 order = 1 direction + 1 property
		Sort s4 = Sort.by(
					Order.asc("bookCost"),
					Order.desc("bookName")
				);
		repo.findAll(s4).forEach(System.out::println);
	}

}
