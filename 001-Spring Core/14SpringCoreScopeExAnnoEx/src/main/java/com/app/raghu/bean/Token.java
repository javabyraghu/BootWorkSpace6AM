package com.app.raghu.bean;

import java.util.Random;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.ToString;

@ToString
@Component("tok")
@Lazy
//@Scope("prototype")
public class Token {

	private int token;

	public Token() {
		super();
		token = new Random().nextInt(9999);
		System.out.println("FROM CONSTRCUTOR");
	}
	
}
