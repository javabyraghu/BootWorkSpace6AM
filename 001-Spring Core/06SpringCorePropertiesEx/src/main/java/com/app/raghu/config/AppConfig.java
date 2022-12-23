package com.app.raghu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@ComponentScans({
	@ComponentScan("com.app.raghu"),
	@ComponentScan("com.xyz.test"),
	@ComponentScan("com.one.two")
})
@PropertySources({})
@PropertySource("classpath:myapp.properties")
public class AppConfig {

}
