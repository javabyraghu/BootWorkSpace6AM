package com.app.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.raghu.entity.Department;

public interface DepartmentRepository 
extends JpaRepository<Department, Integer> {

}
