package com.app.raghu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.app.raghu.bean.Vendor;

@Configuration
public class AppConfig {
	
	@Bean
	public Vendor vob1() {
		Vendor v1 = new Vendor();
		v1.setVname("V1-ABC");
		return v1;
	}
	
	@Bean
	@Primary
	public Vendor vob2() {
		Vendor v2 = new Vendor();
		v2.setVname("V2-XYZ");
		return v2;
	}
	
	
	
}
