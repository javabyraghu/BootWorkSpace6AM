package com.app.raghu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.raghu.bean.DatabaseCon;
import com.app.raghu.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		DatabaseCon db = ac.getBean("dbObj", DatabaseCon.class);
		System.out.println(db);
	}
}
