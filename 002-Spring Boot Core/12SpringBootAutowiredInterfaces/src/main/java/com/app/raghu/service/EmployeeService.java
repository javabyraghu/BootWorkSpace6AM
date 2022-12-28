package com.app.raghu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.raghu.repo.EmployeeRepository;

@Component
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;

	@Override
	public String toString() {
		return "EmployeeService [repo=" + repo + "]";
	}
	
	
}
