package com.app.raghu.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Product {

	@Autowired
	@Qualifier("vob1")
	private Vendor vob;//HAS-A
}
