package com.app.raghu.repo;

import org.springframework.data.repository.CrudRepository;

import com.app.raghu.entity.Employee;

public interface EmployeeRepository 
	extends CrudRepository<Employee, Integer>{

}
