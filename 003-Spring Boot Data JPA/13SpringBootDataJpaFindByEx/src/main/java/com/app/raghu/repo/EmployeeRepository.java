package com.app.raghu.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.raghu.entity.Employee;

public interface EmployeeRepository 
	extends JpaRepository<Employee, Integer>{

	//SQL: select * from emptab where esal<?
	List<Employee> findByEmpSalLessThan(Double esal);
	
	//sql: select * from emptab where ename IS NOT NULL
	List<Employee> findByEmpNameIsNotNull();
	
	//sql: select * from emptab where dept=?
	List<Employee> findByEmpDept(String dept);
	List<Employee> findByEmpDeptIs(String dept);
	List<Employee> findByEmpDeptEquals(String dept);
	
	
	//sql: select * from emptab where ename like 'input'
	List<Employee> findByEmpNameLike(String input);
	
	//sql: select * from emptab where eid!=? or ename is not null;
	List<Employee> findByEmpIdNotOrEmpNameIsNotNull(Integer empId);
}
