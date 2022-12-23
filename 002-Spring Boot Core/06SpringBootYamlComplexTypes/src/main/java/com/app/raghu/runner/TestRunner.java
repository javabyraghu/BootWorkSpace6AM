package com.app.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.raghu.bean.BookInfo;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private BookInfo bo;
	
	public void run(String... args) throws Exception {
		System.out.println(bo);
		System.out.println(bo.getAuthors().getClass().getName());
		System.out.println(bo.getVersions().getClass().getName());
		
		
	}

}
