package com.app.raghu.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.raghu.entity.Course;
import com.app.raghu.entity.Student;
import com.app.raghu.repo.CourseRepository;
import com.app.raghu.repo.StudentRepository;

@Component
public class TestDataRunner implements CommandLineRunner {

	@Autowired
	private StudentRepository srepo;
	
	@Autowired
	private CourseRepository crepo;
	
	public void run(String... args) throws Exception {
		Course c1 = new Course(10, "Core Java", 2000.0);
		Course c2 = new Course(11, "SBMS", 4000.0);
		Course c3 = new Course(12, "UI TECH", 3000.0);
		crepo.save(c1);
		crepo.save(c2);
		crepo.save(c3);
		
		Student s1 = new Student(9001, "AJAY", "HYD", Arrays.asList(c1,c2));
		Student s2 = new Student(9002, "SAM", "BAN", Arrays.asList(c2,c3));
		Student s3 = new Student(9003, "SYED", "CHN", Arrays.asList(c1,c2,c3));
		
		srepo.save(s1);
		srepo.save(s2);
		srepo.save(s3);
		
	}

}
