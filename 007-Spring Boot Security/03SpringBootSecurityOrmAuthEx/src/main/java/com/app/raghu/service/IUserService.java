package com.app.raghu.service;

import java.util.Optional;

import com.app.raghu.entity.User;

public interface IUserService {

	public Integer saveUser(User user);
	public Optional<User> findByUserEmail(String userEmail);
}
