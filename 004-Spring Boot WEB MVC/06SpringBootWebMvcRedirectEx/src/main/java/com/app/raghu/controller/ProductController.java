package com.app.raghu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProductController {

	//.../delete?pid=___
	@GetMapping("/delete")
	public String removeProduct(
			@RequestParam Integer pid,
			RedirectAttributes attributes
			) 
	{
		//logic to delete product
		String message = "Product Deleted "+ pid;
		System.out.println("FROM DELETE PRODUUCT METHOD");
		
		attributes.addAttribute("message", message);
		return "redirect:all"; 
	}

	@GetMapping("/all")
	public String showProducts(
			@RequestParam(required = false) String message,
			Model model
			)
	{
		System.out.println("FROM ALL PRODUCTS METHOD");
		model.addAttribute("message", message);
		return "ProductPage";
	}
	
	
}
