package com.app.raghu.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.raghu.entity.Employee;

@Component
public class TestQueryRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	
	public void run(String... args) throws Exception {
		repo.save(new Employee(101, "A", 200.0, "DEV"));
		
		int count = repo.updateSalByName(300.0, "A");
		System.out.println(count);//no.of rows effected 
		
		List<Object[]> arr = repo.getData();
		arr.stream().map(e->e[0]+" "+e[1]).forEach(System.out::println);
	}
}
