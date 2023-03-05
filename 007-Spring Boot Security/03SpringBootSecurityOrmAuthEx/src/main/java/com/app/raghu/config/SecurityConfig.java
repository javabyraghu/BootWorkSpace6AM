package com.app.raghu.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Autowired
	private UserDetailsService userDetailsService;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Bean
	public AuthenticationManager authenticationManager(
			AuthenticationConfiguration configuration)
						throws Exception
	{
		return configuration.getAuthenticationManager();
	}
	
	//Authentication
	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(passwordEncoder);
		return provider;
	}
	
	//Authorization
	@Bean
	public SecurityFilterChain configAuth(HttpSecurity http) throws Exception {
		http.authorizeRequests(
				request -> request.antMatchers("/","/home").permitAll()
				.antMatchers("/register","/save").permitAll()
				.antMatchers("/customer").hasAuthority("CUSTOMER")
				.antMatchers("/admin").hasAuthority("ADMIN")
				.anyRequest().authenticated()
				)
		
		.formLogin( form -> form.loginPage("/login").permitAll() )
		.logout( logout -> logout.permitAll());
		
		return http.build();
	}
	
	
	
	
}
