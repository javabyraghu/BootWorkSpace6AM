package com.app.raghu.runner;

import java.io.FileInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.raghu.entity.Product;
import com.app.raghu.repo.ProductRepository;

@Component
public class ProductRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	
	public void run(String... args) throws Exception {
		FileInputStream fis = new FileInputStream("D:/images/iphone14pro.png");
		byte[] barr = new byte[fis.available()];
		fis.read(barr);
		
		String input ="HEllo welcome ?! How are you ? where are you.. congrats ... text me when you see this message...............";
		char[] carr = input.toCharArray();
		
		Product p = new Product(101, "IPhone", 6500.0, barr, carr);
		
		repo.save(p);
		
		fis.close();
		
		
	}

}
