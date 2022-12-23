package com.app.raghu;

//ctrl+shift+O
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	//main > ctrl+space > enter key
	public static void main(String[] args) {
		//creating spring container
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		//read object
		Object ob = ac.getBean("mobj");
		//print data
		System.out.println(ob);
	}
}
