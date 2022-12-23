package com.app.raghu.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.app.raghu.bean.ExcelExport;
import com.app.raghu.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		ExcelExport ee = ac.getBean("exObj",ExcelExport.class);
		System.out.println("FROM MAIN");
		System.out.println(ee);
		//ac.registerShutdownHook(); //old-style
		ac.close();
	}
}
