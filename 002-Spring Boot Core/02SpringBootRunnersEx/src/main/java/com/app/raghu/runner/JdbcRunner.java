package com.app.raghu.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(10)
@Component
public class JdbcRunner implements CommandLineRunner {

	public void run(String... args) throws Exception {
		System.out.println("FROM JDBC RUNNER");
	}
}
