package com.app.raghu.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.raghu.entity.User;
import com.app.raghu.repo.UserRepository;
import com.app.raghu.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepository repo;
	
	public Integer saveUser(User user) {
		user = repo.save(user);
		return user.getUserId();
	}

	public Optional<User> findByUserEmail(String userEmail) {
		return repo.findByUserEmail(userEmail);
	}

}
