package com.app.raghu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudCartServiceExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudCartServiceExApplication.class, args);
	}

}
