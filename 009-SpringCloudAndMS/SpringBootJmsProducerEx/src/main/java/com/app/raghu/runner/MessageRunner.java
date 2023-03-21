package com.app.raghu.runner;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.app.raghu.producer.ProducerService;

@Component
public class MessageRunner { 
//implements CommandLineRunner {

	@Autowired
	private ProducerService ps;
	
	//public void run(String... args) throws Exception {
	@Scheduled(cron = "*/10 * * * * *")
	public void testRun() throws Exception {
		ps.sendMessage("Hello : " + new Date(System.currentTimeMillis()));
		System.out.println("PRODUCER SENT MESSAGE");
	}

}
