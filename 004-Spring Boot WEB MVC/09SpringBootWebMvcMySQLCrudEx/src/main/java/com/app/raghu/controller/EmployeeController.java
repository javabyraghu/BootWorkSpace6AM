package com.app.raghu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.raghu.entity.Employee;
import com.app.raghu.exception.EmployeeNotFoundException;
import com.app.raghu.service.IEmployeeService;

@Controller
//@RequestMapping("/employee")
@RequestMapping({"/employee","/"})
public class EmployeeController {

	@Autowired
	private IEmployeeService service;
	
	//1. display register page
	//@GetMapping("/register")
	@GetMapping({"/register","/"})
	public String showRegsiter() {
		return "EmployeeRegister";
	}
	
	//2. Read Form data and insert in DB
	@PostMapping("/save")
	public String saveForm(
			@ModelAttribute Employee employee,
			Model model
			) 
	{
		//call service and get id
		Integer id = service.saveEmployee(employee);
		// construct message
		String message = "Employee '"+id+"' Created";
		//send message to UI
		model.addAttribute("message", message);
		//goto UI
		return "EmployeeRegister";
	}
	
	//3. get All Rows From DB and display as HTML table
	/*@GetMapping("/all")
	public String showAll(
			@RequestParam(required = false) String message,
			Model model) 
	{
		//fetch data from DB using service
		List<Employee> list = service.getAllEmployees();

		//send this data to UI/View
		model.addAttribute("list", list);
		model.addAttribute("message", message);
		
		//goto UI Page
		return "EmployeeData";
	}*/
	
	//new pagination based all method code
	// .../all?page=__&size=__
	@GetMapping("/all")
	public String showAll(
			@PageableDefault(page = 0, size=3) Pageable pageable,
			@RequestParam(required = false) String message,
			Model model) 
	{
		//fetch data from DB using service
		Page<Employee> page = service.getAllEmployees(pageable);

		//send this data to UI/View
		model.addAttribute("list", page.getContent());
		model.addAttribute("page", page);
		model.addAttribute("message", message);
		
		//goto UI Page
		return "EmployeeData";
	}
	
	
	//4. Delete based on ID
	@GetMapping("/delete")
	public String doDelete(
			@RequestParam Integer id,
			RedirectAttributes attributes
			) 
	{
		try {
			//perform delete operation
			service.deleteEmployee(id);
			//send message to All
			attributes.addAttribute("message", "Employee '"+id+"' Deleted");
		} catch (EmployeeNotFoundException e) {
			e.printStackTrace();
			attributes.addAttribute("message", e.getMessage());
		}
		//redirect
		return "redirect:all";
	}
	
	
	//5. Show data in Edit Page
	@GetMapping("/edit")
	public String showEdit(
			@RequestParam Integer id,
			Model model
			)
	{
		String page = null;
		try {
			//fetch data from DB using service
			Employee employee = service.getOneEmployee(id);
			//send to UI
			model.addAttribute("employee", employee);
			//goto edit page
			page = "EmployeeEdit";
		} catch (EmployeeNotFoundException e) {
			e.printStackTrace();
			//read exception message
			model.addAttribute("message", e.getMessage());
			//goto all page
			page ="redirect:all";
		}
		return page;
	}
	
	
	//6. Update on Edit Form submit 
	@PostMapping("/update")
	public String updateForm(
			@ModelAttribute Employee employee,
			RedirectAttributes attributes
			) 
	{
		//update form data
		service.updateEmployee(employee);
		attributes.addAttribute("message", "Employee '"+employee.getEmpId()+"' Updated");
		return "redirect:all";
	}
	
	
}
