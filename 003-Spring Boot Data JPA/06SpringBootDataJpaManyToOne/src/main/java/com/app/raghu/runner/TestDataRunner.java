package com.app.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.raghu.entity.Department;
import com.app.raghu.entity.Employee;
import com.app.raghu.repo.DepartmentRepository;
import com.app.raghu.repo.EmployeeRepository;

@Component
public class TestDataRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository erepo;

	@Autowired
	private DepartmentRepository drepo;

	public void run(String... args) throws Exception {
		Department d1 = new Department(101, "DEV", "XYZ");
		Department d2 = new Department(102, "QA", "MMM");
		Department d3 = new Department(103, "BA", "PPP");
		Department d4 = new Department(104, "ART", "XYZ");
		Department d5 = new Department(105, "ITHD", "OUY");

		drepo.save(d1);
		drepo.save(d2);
		drepo.save(d3);
		drepo.save(d4);
		drepo.save(d5);

		Employee e1 = new Employee(10, "SAM", 200.0, null);
		Employee e2 = new Employee(11, "SYED", 300.0, d2);
		Employee e3 = new Employee(12, "AJAY", 400.0, d3);
		Employee e4 = new Employee(13, "AHMED", 500.0, null);
		Employee e5 = new Employee(14, "KHAN", 600.0, null);

		erepo.save(e1);
		erepo.save(e2);
		erepo.save(e3);
		erepo.save(e4);
		erepo.save(e5);

		//erepo.fetchEmpNameAndDeptCode()
		//erepo.fetchAllEmpNameAndDeptCode()
		erepo.fetchEmpNameAndAllDeptCode()
		.stream()
		.map(e->e[0]+"-"+e[1])
		.forEach(System.out::println);
	}

}
