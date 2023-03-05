package com.app.raghu.service.impl;

import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.app.raghu.entity.User;
import com.app.raghu.repo.UserRepository;
import com.app.raghu.service.IUserService;

@Service
public class UserServiceImpl implements IUserService, UserDetailsService {

	@Autowired
	private UserRepository repo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	public Integer saveUser(User user) {
		String pwd = encoder.encode( user.getUserPassword() );
		user.setUserPassword(pwd);
		
		user = repo.save(user);
		return user.getUserId();
	}

	public Optional<User> findByUserEmail(String userEmail) {
		return repo.findByUserEmail(userEmail);
	}
	
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {

		Optional<User> opt = findByUserEmail(username);
		if(opt.isEmpty()) {
			throw new UsernameNotFoundException(username + " not exist");
		} 
		
		//Entity clas user object
		User user = opt.get();
		
		//Spring Security user object (un,pwd, Collection<GA>)
		return new org.springframework.security.core.userdetails.User(
				user.getUserEmail(), 
				user.getUserPassword(), 
				user.getUserRoles().stream()
				.map(role -> new SimpleGrantedAuthority(role))
				.collect(Collectors.toSet())
				);
	}

}
