package com.app.raghu.repo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.app.raghu.model.Student;

public interface StudentRepository 
	extends ReactiveMongoRepository<Student, String> {

}
