package com.app.raghu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SpringBooJmsConsumerExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBooJmsConsumerExApplication.class, args);
	}

}
