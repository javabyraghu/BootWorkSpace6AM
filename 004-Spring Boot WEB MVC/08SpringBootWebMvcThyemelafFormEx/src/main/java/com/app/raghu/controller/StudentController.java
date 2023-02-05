package com.app.raghu.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.raghu.bean.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	//1. show edit Form with data
	@GetMapping("/edit")
	public String showEditPage(Model model)
	{
		Student student = new Student(101, "SAM", 300.0 , "SBMS");
		model.addAttribute("student", student);
		
		List<String> courses = Arrays.asList(
				"Core Java", "Adv Java", 
				"SBMS", "Angular", "AWS"
				);
		model.addAttribute("courses", courses);
		return "StudentEdit";
	}
	
}
