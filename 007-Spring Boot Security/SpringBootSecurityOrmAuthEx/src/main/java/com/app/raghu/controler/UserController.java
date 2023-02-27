package com.app.raghu.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.raghu.entity.User;
import com.app.raghu.service.IUserService;

@Controller
public class UserController {

	@Autowired
	private IUserService service;
	
	@GetMapping({"/","/home"})
	public String showHome() {
		return "home";
	}
	
	@GetMapping("/hello")
	public String showHello() {
		return "hello";
	}
	
	@GetMapping("/admin")
	public String showAdmin() {
		return "admin";
	}
	
	@GetMapping("/customer")
	public String showCustomer() {
		return "customer";
	}
	
	@GetMapping("/login")
	public String showLogin() {
		return "login";
	}
	
	@GetMapping("/register")
	public String showReg() {
		return "Register";
	}
	
	@PostMapping("/save")
	public String saveUser(
			@ModelAttribute User user,
			Model model) 
	{
		Integer id = service.saveUser(user);
		String message = "User '"+id+"' created";
		model.addAttribute("message", message);
		return "Register";
	}
	
}
