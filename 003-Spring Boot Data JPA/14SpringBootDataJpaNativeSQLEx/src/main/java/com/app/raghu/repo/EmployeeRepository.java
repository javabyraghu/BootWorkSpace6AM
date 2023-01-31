package com.app.raghu.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.app.raghu.entity.Employee;

public interface EmployeeRepository 
	extends JpaRepository<Employee, Integer>{

	@Query(value = "SELECT E.ENAME, E.ESAL FROM EMPTAB E", nativeQuery = true)
	List<Object[]> getData();

	@Transactional
	@Modifying
	@Query("UPDATE Employee e SET e.empSal=:esal WHERE e.empName=:ename")
	int updateSalByName(Double esal, String ename);
}
