package com.app.raghu.runner;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.raghu.entity.Product;
import com.app.raghu.repo.ProductRepository;

@Component
public class TestDataRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository prepo;
	
	public void run(String... args) throws Exception {
		Product p1 = new Product(101, "PEN", new Date(), new Date(), new Date());
		prepo.save(p1);
		
		//core Java code
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		String dte = sdf.format(new Date());
		System.out.println(dte);
		
		
	}

}
