package com.app.raghu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	//  /emp + GET
	@RequestMapping("/emp")
	public String showEmp() {
		return "EmpPage";
	}
	
	// /show + GET
	//@RequestMapping("/show")
	@GetMapping("/show")
	public String showHome() {
		return "HomePage";
	}
	
	// /save + POST
	@PostMapping("/save")
	public String saveUser() {
		return "UserPage";
	}
}
