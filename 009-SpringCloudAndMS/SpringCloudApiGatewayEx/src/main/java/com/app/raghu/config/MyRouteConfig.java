package com.app.raghu.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRouteConfig {
	
	@Bean
	public RouteLocator configureRoutes(RouteLocatorBuilder builder) {
		return builder
				.routes()
				.route("cartServiceApp",
							r -> r.path("/cart/**")
								  .uri("lb://CART-SERVICE")
							)
				.route("orderServiceApp", 
							r-> r.path("/order/**")
								 .uri("lb://ORDER-SERVICE")
							)
				.build();
	}
}
