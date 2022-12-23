package com.app.raghu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.raghu.bean.Token;
import com.app.raghu.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		System.out.println("** CONTAINER CREATION START***");
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("****CONTAINER CREATION START****");
		
		System.out.println("-----READ AND PRINT OBJECT-------");
		Token t1 = ac.getBean("tok", Token.class);
		System.out.println(t1);
		
		/*Token t2 = ac.getBean("tok", Token.class);
		System.out.println(t2);
		
		Token t3 = ac.getBean("tok", Token.class);
		System.out.println(t3);*/
	}
}
