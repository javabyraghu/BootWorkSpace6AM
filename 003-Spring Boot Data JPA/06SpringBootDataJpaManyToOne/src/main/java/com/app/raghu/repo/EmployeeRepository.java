package com.app.raghu.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.raghu.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query("SELECT E.empName, D.deptCode FROM Employee E INNER JOIN E.dob as D ")
	List<Object[]> fetchEmpNameAndDeptCode();
	
	@Query("SELECT E.empName, D.deptCode FROM Employee E LEFT JOIN E.dob as D ")
	List<Object[]> fetchAllEmpNameAndDeptCode();
	
	@Query("SELECT E.empName, D.deptCode FROM Employee E RIGHT JOIN E.dob as D ")
	//@Query("SELECT E.empName, D.deptCode FROM Employee E FULL JOIN E.dob as D ")
	List<Object[]> fetchEmpNameAndAllDeptCode();
}
