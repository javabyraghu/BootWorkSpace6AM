package com.app.raghu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.raghu.bean.EmployeeService;
import com.app.raghu.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeService es  = ac.getBean("esobj", EmployeeService.class);
		System.out.println(es);
	}
}
