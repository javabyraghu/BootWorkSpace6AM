package com.app.raghu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.raghu.bean.PdfExport;

@Configuration
public class AppConfig {
	
	@Bean
	public PdfExport pobj() {
		PdfExport p = new PdfExport();
		p.setFileName("SBMS");
		p.setFileAuth("RAGHU");
		return p;
	}
	
}
