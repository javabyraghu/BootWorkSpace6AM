package com.app.raghu.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderRestController {

	@PostMapping("/create")
	public ResponseEntity<String> createOrder() {
		return new ResponseEntity<String>("CREATED!!", HttpStatus.OK); //200
	}
	
	@GetMapping("/find")
	public ResponseEntity<String> fetchOrder() {
		return new ResponseEntity<String>("FETCHING ORDER!!", HttpStatus.OK);
	}

	@PutMapping("/modify")
	public ResponseEntity<String> modifyOrder() {
		return new ResponseEntity<String>("MODIFY ORDER!!", HttpStatus.OK);
	}
	
	@DeleteMapping("/remove")
	public ResponseEntity<String> removeOrder() {
		return new ResponseEntity<String>("REMOVE ORDER!!", HttpStatus.OK);
	}
	
	@PatchMapping("/total")
	public ResponseEntity<String> updateTotalOrder() {
		return new ResponseEntity<String>("PATCHING ORDER!!", HttpStatus.OK);
	}
	
}

