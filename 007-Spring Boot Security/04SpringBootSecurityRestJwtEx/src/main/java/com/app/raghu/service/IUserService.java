package com.app.raghu.service;

import com.app.raghu.entity.User;

public interface IUserService {

	Integer saveUser(User user);
	User findByUsername(String username);
}
