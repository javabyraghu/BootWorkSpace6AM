package com.app.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.raghu.repo.BookRepository;

@Component
public class TestQueryCustomRunner implements CommandLineRunner {

	@Autowired
	private BookRepository repo;

	public void run(String... args) throws Exception {

		// repo.getDataA("Bootstrap", 200.0).forEach(System.out::println);
		// repo.getDataB("Bootstrap", 200.0).forEach(System.out::println);
		// repo.getDataC("AJAY").forEach(System.out::println);

		//repo.getDataD("ALL").stream().map(ob -> ob[0] + "-" + ob[1])
		repo.getDataE("AJAY").stream().map(ob -> ob[0] + "-" + ob[1] +"/"+ob[2])
		.forEach(System.out::println);

	}

}
