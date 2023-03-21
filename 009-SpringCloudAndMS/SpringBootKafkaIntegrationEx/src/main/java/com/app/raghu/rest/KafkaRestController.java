package com.app.raghu.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.raghu.entity.Stock;
import com.app.raghu.service.ProducerService;
import com.app.raghu.store.MessageStore;

@RestController
@RequestMapping("/kafka")
public class KafkaRestController {
	
	@Autowired
	private ProducerService producer;
	
	@Autowired
	private MessageStore store;
	
	//.../send?scode=__&scost=__
	@GetMapping("/send")
	public String readDetails(
			@RequestParam String scode,
			@RequestParam Double scost
			) 
	{
		Stock stock = new Stock();
		stock.setStockCode(scode);
		stock.setStockCost(scost);
		
		producer.send(stock);
		
		return "SENT SUCCESS";
	}
	
	@GetMapping("/all")
	public List<Stock> fetchAll() {
		return store.fetchAll();
	}
}
