package com.app.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.raghu.entity.Profile;

public interface ProfileRepository 
	extends JpaRepository<Profile, Integer> {

}
