package com.app.raghu.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {
	
	@Autowired
	private ProjectService pservice;

	@Override
	public String toString() {
		return "EmployeeService [pservice=" + pservice + "]";
	}

	
}
