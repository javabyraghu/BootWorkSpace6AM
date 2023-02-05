package com.app.raghu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.raghu.bean.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@GetMapping("/show")
	public String showData(Model model) {
		System.out.println("=========>" + model.getClass().getName());


		model.addAttribute("eid", 101);
		model.addAttribute("ename", "AJAY");
		model.addAttribute("esal", 500.0);
		
		
		Employee emp = new Employee(55,"DD",999.0);
		model.addAttribute("employee", emp);
		
		return "EmpPage";
	}
}