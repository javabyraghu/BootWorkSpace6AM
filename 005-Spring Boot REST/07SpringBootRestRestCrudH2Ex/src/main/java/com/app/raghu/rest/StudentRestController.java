package com.app.raghu.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.app.raghu.entity.Student;
import com.app.raghu.exception.StudentNotFoundException;
import com.app.raghu.service.IStudentService;

@RestController
@RequestMapping("/v1/api/student") 
public class StudentRestController {

	@Autowired
	private IStudentService service;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveStudent(
			@RequestBody Student student) 
	{
		Integer id = service.saveStudent(student);
		return new ResponseEntity<String>(
				"Student '"+id+"' Created", HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Student>> getAllStudents() {
		List<Student> list = service.getAllStudents();
		return new ResponseEntity<List<Student>>(list, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<?> fetchOneStudent(
			@PathVariable Integer id) 
	{
		ResponseEntity<?> response = null;
		try {
			Student student = service.getOneStudent(id);
			response = new ResponseEntity<Student>(
					student, HttpStatus.OK); //200
			
		} catch (StudentNotFoundException snfe) {
			snfe.printStackTrace();
			throw snfe;
		}
		return response;
	}
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> deleteStudent(
			@PathVariable Integer id)
	{
		ResponseEntity<String> response =  null;
		try {
			service.deleteStudent(id);
			response = new ResponseEntity<String>(
					"Student '"+id+"' Deleted", HttpStatus.OK);
			
		} catch (StudentNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
		return response;
	}
	
	@PutMapping("/modify")
	public ResponseEntity<String> updateStudent(
			@RequestBody Student student
			) 
	{
		ResponseEntity<String> response =  null;
		try {
			service.updateStudent(student);
			response = new ResponseEntity<String>(
					"Student '"+student.getStdId()+"' Update",
					HttpStatus.OK);
			
		} catch (StudentNotFoundException snfe) {
			snfe.printStackTrace();
			throw snfe;
		}
		return response;
	}
}
