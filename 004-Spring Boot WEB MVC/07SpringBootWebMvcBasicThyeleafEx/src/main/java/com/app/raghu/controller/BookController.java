package com.app.raghu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

	@GetMapping("/show")
	public String showPage(Model model)
	{
		model.addAttribute("message", "Hey!!");
		return "BookPage";
	}
	
	@GetMapping("/data")
	public String showData()
	{
		return "BookData";
	}
}
