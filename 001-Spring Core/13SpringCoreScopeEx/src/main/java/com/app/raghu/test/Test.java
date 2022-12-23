package com.app.raghu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.raghu.bean.Product;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		Product p1 = ac.getBean("pobj", Product.class);
		Product p2 = ac.getBean("pobj", Product.class);

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		System.out.println(p1 == p2);

	}
}
