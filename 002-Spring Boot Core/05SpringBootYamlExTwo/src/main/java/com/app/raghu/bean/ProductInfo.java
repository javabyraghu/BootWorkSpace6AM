package com.app.raghu.bean;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties("my.app")
public class ProductInfo {

	private String pcode;
	private int pid;
	private double pcost;
	
	private List<String> colors;
	private Map<String,String> models;
	private Vendor vob;
	
}
