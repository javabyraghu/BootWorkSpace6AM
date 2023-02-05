package com.app.raghu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/***
 * This annotation creates object to our class
 * Also enables HTTP protocol support.
 */
@Controller 
public class HomeController {

	/***
	 * If Request contains URL that ends withs /show 
	 * of type GET then FC will call this method and returns
	 * View Name "Home"
	 */
	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public String showHome() {
		return "Home";
	}
}
