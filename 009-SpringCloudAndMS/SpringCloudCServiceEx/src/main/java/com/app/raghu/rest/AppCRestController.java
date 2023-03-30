package com.app.raghu.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppCRestController {
	
	@GetMapping("/showC")
	public String gotoServiceC() {
		System.out.println("FROM C SERVICE");
		return "FROM C ";
	}
}
