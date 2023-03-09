package com.app.raghu.rest;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserRestController {

	//@GetMapping("/secure")
	public String securedPage(Principal p) {
		System.out.println(p.getClass().getName());
		System.out.println(p);
		return "secure";
	}
	
	@GetMapping("/secure")
	@ResponseBody
	public Principal securedData(Principal p) {
		System.out.println(p.getClass().getName());
		System.out.println(p);
		return p;
	}
	
	@GetMapping("/")
	public String showIndex() {
		return "index";
	}
	
}
