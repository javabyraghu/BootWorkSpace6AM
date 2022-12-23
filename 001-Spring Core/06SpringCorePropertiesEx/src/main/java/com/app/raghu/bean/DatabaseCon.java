package com.app.raghu.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dbObj")
public class DatabaseCon {
	@Value("${my.db}")
	private String driver;
	
	@Value("${my.url}")
	private String url;
	
	@Value("${my.un}")
	private String username;
	
	@Value("${my.pwd}")
	private String password;
	
	@Value("${my.port}")
	private int port;
	
	@Value("${my.enable}")
	private boolean active;
	
	@Override
	public String toString() {
		return "DatabaseCon [driver=" + driver + ", url=" + url + ", username=" + username + ", password=" + password
				+ ", port=" + port + ", active=" + active + "]";
	}	
	
	
}
