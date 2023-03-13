package com.app.raghu.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.app.raghu.bean.CartInfo;

@FeignClient("CART-SERVICE")
public interface CartConsumerService {

	@GetMapping("/cart/message")
	public ResponseEntity<String> showMsgFromCart();
	
	@GetMapping("/cart/info/{code}")
	public ResponseEntity<CartInfo> getInfo(@PathVariable String code);
}
