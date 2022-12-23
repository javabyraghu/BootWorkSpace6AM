package com.app.raghu.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProjectService {

	@Autowired
	private EmployeeService eservice;

	@Override
	public String toString() {
		return "ProjectService [eservice=" + eservice + "]";
	}
	
}
