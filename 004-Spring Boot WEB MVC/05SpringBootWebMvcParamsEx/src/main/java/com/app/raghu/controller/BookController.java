package com.app.raghu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {

	// URL: .../find?auth=__&type=___
	
	@GetMapping("/find")
	public String fetchBook(
			//@RequestParam("auth") String bauth,
			//@RequestParam(value = "auth", required = false) String bauth,
			@RequestParam(value = "auth", required = false, defaultValue = "NONE") String bauth,
			@RequestParam String type,
			Model model
			)
	{
		System.out.println(bauth);
		System.out.println(type);
		model.addAttribute("inputs", bauth+", "+type);
		return "BookPage";
	}
	
	//...details?models=__&code=__&bid=___
	// code , models are optional, bid (int) is must
	@GetMapping("/details")
	public String fetchBookByModel(
			@RequestParam(required = false) String code,
			@RequestParam(required = false, defaultValue = "NEW") String models,
			@RequestParam Integer bid,
			Model model
			) 
	{
		model.addAttribute("inputs", bid+","+","+code+", "+models);
		return "BookPage";
	}
	
	
	
	
	
	
	
	
}
