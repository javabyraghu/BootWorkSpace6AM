package com.app.raghu.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean
	public BCryptPasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}

	
	//2. Authorization
	@Bean
	public SecurityFilterChain configAuthorization(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(
				request -> request.antMatchers("/","/home").permitAll()
				.antMatchers("/admin").hasAuthority("ADMIN")
				.antMatchers("/customer").hasAuthority("CUSTOMER")
				.anyRequest().authenticated()
				)
		.formLogin( 
				form -> form.loginPage("/login").permitAll() 
				.defaultSuccessUrl("/hello", true)
				)
		.logout( logout -> logout.permitAll());
		
		return http.build();
	}
	
	//1. Authentication
	@Bean
	public UserDetailsService configAuthentication(DataSource dataSource)
	{
	
		UserDetails user1 = User.withUsername("sam")
				.password("$2a$10$jdAmRII4HTNQnSrmgygZZ.7FPw.jA1ASXd0kI/ze9OYwJZHv22vue")
				.authorities("ADMIN")
				.build();
		
		UserDetails user2 = User.withUsername("ram")
				.password("$2a$10$qqnCQviDopu2cKdEUrU9J.52CcXfH/VlXo52WZwr5NWopzwad7JSS")
				.authorities("CUSTOMER")
				.build();
		
		JdbcUserDetailsManager users = new JdbcUserDetailsManager(dataSource);
		
		users.createUser(user1);
		users.createUser(user2);
		
		return users;
	}
	
	
	
	
}
