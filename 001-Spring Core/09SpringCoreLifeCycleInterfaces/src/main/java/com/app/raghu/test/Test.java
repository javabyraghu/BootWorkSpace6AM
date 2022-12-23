package com.app.raghu.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.raghu.bean.ExcelExport;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		ExcelExport ee = ac.getBean("exObj",ExcelExport.class);
		System.out.println("FROM MAIN");
		System.out.println(ee);
		//ac.registerShutdownHook(); //old-style
		ac.close();
	}
}
