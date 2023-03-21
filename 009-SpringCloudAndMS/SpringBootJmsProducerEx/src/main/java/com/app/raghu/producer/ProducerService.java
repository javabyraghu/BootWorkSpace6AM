package com.app.raghu.producer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class ProducerService {

	@Autowired
	private JmsTemplate template;
	
	@Value("${my.app.desti-name}")
	private String destination;
	
	public void sendMessage(String message) {
		
		template.send(
				destination,
				new MessageCreator() {
					public Message createMessage(Session session) throws JMSException {
						TextMessage tm = session.createTextMessage(message);
						return tm;
					}
				});
		
		/*template.send(
				destination, //destination name
				(session)->session.createTextMessage(message) //message creator
				);*/
	}
}
