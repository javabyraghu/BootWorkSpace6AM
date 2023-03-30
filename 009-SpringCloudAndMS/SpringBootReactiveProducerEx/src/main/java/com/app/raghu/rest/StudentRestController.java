package com.app.raghu.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.raghu.model.Student;
import com.app.raghu.service.StudentService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/student")
public class StudentRestController {

	@Autowired
	private StudentService service;
	
	@PostMapping("/save")
	public Mono<Student> save(@RequestBody Student student) {
		return service.save(student);
	}
	
	@GetMapping("/find/{id}")
	public Mono<Student> getOne(@PathVariable String id) {
		return service.getOne(id);
	}
	
	@GetMapping("/all")
	public Flux<Student> findAll() {
		return service.findAll();
	}
	
	@DeleteMapping("/remove/{id}")
	public Mono<Void> delete(@PathVariable String id) {
		return service.delete(id);
	}

}
