package com.app.raghu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.raghu.bean.Student;

@Controller
public class StudentController {

	//1. show form
	@GetMapping("/register")
	public String showReg() {
		return "StudentRegister";
	}
	
	
	//2. read form data
	@PostMapping("/save")
	public String showData(
			@ModelAttribute Student student,
			Model model ) 
	{
		System.out.println(student);
		model.addAttribute("student", student);
		return "StudentData";
	}
	
	
	
}
