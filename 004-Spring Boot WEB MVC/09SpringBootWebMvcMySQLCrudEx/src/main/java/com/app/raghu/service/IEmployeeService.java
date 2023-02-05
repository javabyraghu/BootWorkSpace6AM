package com.app.raghu.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.app.raghu.entity.Employee;

public interface IEmployeeService {

	Integer saveEmployee(Employee e);
	List<Employee> getAllEmployees();
	void deleteEmployee(Integer id);
	Employee getOneEmployee(Integer id);
	void updateEmployee(Employee e);
	
	Page<Employee> getAllEmployees(Pageable pageable);
}
