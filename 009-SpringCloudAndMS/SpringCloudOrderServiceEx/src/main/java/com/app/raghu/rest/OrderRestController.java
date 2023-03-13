package com.app.raghu.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.raghu.bean.CartInfo;
import com.app.raghu.service.CartConsumerService;

@RestController
@RequestMapping("/order")
public class OrderRestController {
	
	@Autowired
	private CartConsumerService consumer;

	@GetMapping("/data")
	public ResponseEntity<String> showOrderData() {
		ResponseEntity<String> resp = consumer.showMsgFromCart();
		return ResponseEntity.ok("FROM ORDER SERVICE " + resp.getBody());
	}
	
	@GetMapping("/models")
	public ResponseEntity<String> showInfo() {
		ResponseEntity<CartInfo> resp = consumer.getInfo("TEST");
		return ResponseEntity.ok("FROM ORDER SERVICE " + resp.getBody());
	}
}
