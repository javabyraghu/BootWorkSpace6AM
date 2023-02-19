package com.app.raghu.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.raghu.bean.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {

	@GetMapping("/showA/{id}")
	public ResponseEntity<String> showMsgA(
			@PathVariable String id) 
	{
		return new ResponseEntity<String>("WELCOME " + id, HttpStatus.OK);
	}
	
	
	@PostMapping("/showB")
	public ResponseEntity<String> showMsgB(
			@RequestBody Employee employee
			)
	{
		return new ResponseEntity<String>("WELCOME POST " + employee, HttpStatus.OK);
	}
	
	@DeleteMapping("/showC/{id}")
	public ResponseEntity<String> showMsgC(
			@PathVariable String id) 
	{
		return new ResponseEntity<String>("DELETE " + id, HttpStatus.OK);
	}
	
	@PutMapping("/showD")
	public ResponseEntity<String> showMsgD(
			@RequestBody Employee employee) 
	{
		return new ResponseEntity<String>("PUT " + employee, HttpStatus.OK);
	}
}
