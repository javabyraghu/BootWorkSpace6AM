package com.app.raghu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.app.raghu.entity.Stock;
import com.app.raghu.store.MessageStore;
import com.app.raghu.util.JsonUtil;

import lombok.extern.slf4j.Slf4j;

/**
 * This service class gets data from kafka S/w
 * Reads in JSON Format (after Deserialize)
 * Then we need to convert into Object format
 * call MessageStore to persist 
 *
 */
@Component
@Slf4j
public class ConsumerService {

	@Autowired
	private JsonUtil util;
	
	@Autowired
	private MessageStore store;
	
	@KafkaListener(topics = "${kafka-topic-name}", groupId = "group-id")
	public void readMessage(String message) {
		log.info("MESSAGE RECEIVED AT CONSUMER :: {}", message);
		Stock stock = util.convertJsonToObject(message);
		store.save(stock);
	}
}
