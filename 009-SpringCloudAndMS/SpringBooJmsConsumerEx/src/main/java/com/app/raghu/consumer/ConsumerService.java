package com.app.raghu.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerService {

	@JmsListener(destination = "${my.app.desti-name}")
	public void readMessage(String message) {
		System.out.println("FROM CONSUMER==> " + message);
	}
}
