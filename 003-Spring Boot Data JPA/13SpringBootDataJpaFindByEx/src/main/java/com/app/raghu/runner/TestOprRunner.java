package com.app.raghu.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.raghu.entity.Employee;
import com.app.raghu.repo.EmployeeRepository;

@Component
public class TestOprRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepository repo;

	public void run(String... args) throws Exception {
		repo.saveAll(Arrays.asList(
					new Employee(10, "AA", 200.0, "DEV"),
					new Employee(11, "AB", 300.0, "DEV"),
					new Employee(12, null, 400.0, "QA"),
					new Employee(13, "AD", 500.0, "QA")
				));
		
		repo.findByEmpSalLessThan(400.0).forEach(System.out::println);
		//repo.findByEmpNameIsNotNull().forEach(System.out::println);
		//repo.findByEmpDept("DEV").forEach(System.out::println);
		//repo.findByEmpDeptIs("DEV").forEach(System.out::println);
		//repo.findByEmpDeptEquals("DEV").forEach(System.out::println);
		
		//repo.findByEmpNameLike("A%").forEach(System.out::println);
		
		//repo.findByEmpNameLike("A%").forEach(System.out::println);
		
		//repo.findByEmpIdNotOrEmpNameIsNotNull(10).forEach(System.out::println);
		
		
	}
}
