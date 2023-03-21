package com.app.raghu.store;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.raghu.entity.Stock;
import com.app.raghu.repo.StockRepository;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class MessageStore {

	@Autowired
	private StockRepository repo;
	
	public void save(Stock stock) {
		log.info("INSIDE MESSAGE STORE TO SAVE {}", stock);
		repo.save(stock);
	}
	
	public List<Stock> fetchAll() {
		log.info("INSIDE MESSAGE STORE TO FETCH ");
		return repo.findAll();
	}
}
