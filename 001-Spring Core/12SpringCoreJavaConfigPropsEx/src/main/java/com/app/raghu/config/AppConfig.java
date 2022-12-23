package com.app.raghu.config;

//ctrl+shift+O
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.app.raghu.bean.MyDbConnection;

@Configuration
@PropertySource("classpath:jdbc.properties")
public class AppConfig {
	
	@Autowired
	private Environment env;
	
	@Bean
	public MyDbConnection dbObj() {
		MyDbConnection d = new MyDbConnection();
		d.setDriver(env.getProperty("my.app.driver-class"));
		d.setUrl(env.getProperty("my.app.url"));
		return d;
	}
}
