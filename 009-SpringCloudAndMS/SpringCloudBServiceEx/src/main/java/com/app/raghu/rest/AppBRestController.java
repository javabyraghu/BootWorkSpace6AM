package com.app.raghu.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AppBRestController {

	@Autowired
	private RestTemplate rt;
	
	@GetMapping("/showB")
	public String gotoServiceC() {
		System.out.println("FROM B SERVICE");
		
		String body = rt.getForObject("http://localhost:8083/showC", String.class);
		
		System.out.println("BACK TO B SERVICE");
		
		return "FROM B => " + body;
	}
}
