package com.app.raghu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.app.raghu.entity.Employee;
import com.app.raghu.exception.EmployeeNotFoundException;
import com.app.raghu.repo.EmployeeRepository;
import com.app.raghu.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	public Integer saveEmployee(Employee e) {
		e = repo.save(e);
		return e.getEmpId();
	}

	public List<Employee> getAllEmployees() {
		List<Employee> list = repo.findAll();
		return list;
	}

	public void deleteEmployee(Integer id) {
		//repo.deleteById(id);
		repo.delete(getOneEmployee(id));
	}

	public Employee getOneEmployee(Integer id) {
		/*Optional<Employee> opt = repo.findById(id);
		if(opt.isPresent()) {
			Employee e = opt.get();
			return e;
		}
		else 
			throw new EmployeeNotFoundException("EMPLOYEE '"+id+"' NOT EXIST");
			*/
		return repo.findById(id).orElseThrow(
				()-> new EmployeeNotFoundException("EMPLOYEE '"+id+"' NOT EXIST")
				);
	}

	public void updateEmployee(Employee e) {
		if(e.getEmpId()!=null && repo.existsById(e.getEmpId()))
			repo.save(e);
		else 
			throw new EmployeeNotFoundException("EMPLOYEE '"+e.getEmpId()+"' NOT EXIST");
	}
	
	@Override
	public Page<Employee> getAllEmployees(Pageable pageable) {
		Page<Employee> page = repo.findAll(pageable);
		return page;
	}

}
