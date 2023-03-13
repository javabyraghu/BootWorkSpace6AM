package com.app.raghu.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.raghu.bean.CartInfo;

@RestController
@RequestMapping("/cart")
public class CartRestController {
	
	@Value("${server.port}")
	private String port;

	@GetMapping("/message")
	public ResponseEntity<String> showMsgFromCart() {
		return ResponseEntity.ok(":: FROM CART SERVICE :: " + port);
	}
	
	@GetMapping("/info/{code}")
	public ResponseEntity<CartInfo> getInfo(@PathVariable String code) {
		return ResponseEntity.ok(new CartInfo(code, 10000.0));
	}
}
