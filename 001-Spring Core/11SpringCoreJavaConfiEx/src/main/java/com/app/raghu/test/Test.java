package com.app.raghu.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.raghu.bean.PdfExport;
import com.app.raghu.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		PdfExport pe = ac.getBean("pobj",PdfExport.class);
		System.out.println(pe);
	}
}
