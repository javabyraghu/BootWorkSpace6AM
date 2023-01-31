package com.app.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.raghu.repo.EmployeeRepository;

@Component
public class TestOprRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepository repo;

	public void run(String... args) throws Exception {
		System.out.println(repo.getClass().getName());
	}
}
