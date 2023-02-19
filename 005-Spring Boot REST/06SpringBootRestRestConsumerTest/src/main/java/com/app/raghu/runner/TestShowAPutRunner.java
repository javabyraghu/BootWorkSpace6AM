package com.app.raghu.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TestShowAPutRunner implements CommandLineRunner {

	public void run(String... args) throws Exception {
		//1. create RestTemplate object
		RestTemplate rt = new RestTemplate();
		
		//2. Define base URL
		String url = "http://localhost:8080/employee/showD";
		
		//3. Create RequestEntity (Body + headers)
		String body = "{\"empId\":999,\"empName\":\"AAAA\",\"empSal\":44000.25}";
		HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<String> requestBody = new HttpEntity<String>(body, header);
		
		//4. make HTTP call and get Response
		ResponseEntity<String> response = rt.exchange(url, HttpMethod.PUT, requestBody, String.class); 
				
		//5. print details
		System.out.println("Body :" + response.getBody());
		System.out.println("CODE:int :" + response.getStatusCode().value());
		System.out.println("CODE:String :" + response.getStatusCode().name());
		
	}

}
