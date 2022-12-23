package com.app.raghu.bean;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
//@Profile("qa")
@Profile({ "default", "qa" })
public class SwaggerConfigRunner implements CommandLineRunner {

	public void run(String... args) throws Exception {
		System.out.println("SWAGGER CONFIG!! ");
	}
}
