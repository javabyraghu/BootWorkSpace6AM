package com.app.raghu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootJmsProducerExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJmsProducerExApplication.class, args);
	}

}
