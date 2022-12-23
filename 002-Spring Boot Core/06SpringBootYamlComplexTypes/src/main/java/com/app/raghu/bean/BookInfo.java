package com.app.raghu.bean;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties("my.book")
public class BookInfo {

	private String bname;
	
	private List<String> authors;
	//private Set<String> authors;
	//private String[] authors;
	
	private Map<String,String> versions;
	//private Properties versions;
	
	private Publisher pob; //HAS-A Variable
	
}
