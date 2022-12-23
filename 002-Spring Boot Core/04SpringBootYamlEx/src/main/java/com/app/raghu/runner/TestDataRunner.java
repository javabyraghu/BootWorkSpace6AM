package com.app.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.raghu.bean.DatabaseCon;

@Component
public class TestDataRunner implements CommandLineRunner {

	@Autowired
	private DatabaseCon con;
	
	public void run(String... args) throws Exception {
		System.out.println(con);
	}
}
