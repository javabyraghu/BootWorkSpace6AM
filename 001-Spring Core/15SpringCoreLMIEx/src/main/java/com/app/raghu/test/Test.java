package com.app.raghu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.raghu.bean.TokenService;
import com.app.raghu.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		TokenService ts1 = ac.getBean("tokenService", TokenService.class);
		System.out.println(ts1);
		System.out.println("Token Service HS:"+ts1.hashCode());
		System.out.println("Token HS:"+ts1.getTokenOb().hashCode());

		System.out.println("------------------------------");

		TokenService ts2 = ac.getBean("tokenService", TokenService.class);
		System.out.println(ts2);
		System.out.println("Token Service HS:"+ts2.hashCode());
		System.out.println("Token HS:"+ts2.getTokenOb().hashCode());

		System.out.println("------------------------------");

		TokenService ts3 = ac.getBean("tokenService", TokenService.class);
		System.out.println(ts3);
		System.out.println("Token Service HS:"+ts3.hashCode());
		System.out.println("Token HS:"+ts3.getTokenOb().hashCode());

	}
}
