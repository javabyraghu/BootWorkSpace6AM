package com.app.raghu.model;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
//@Document -- optional to add
//@Document(collection = "student_collection")
public class Student {
	
	@Id 
	private String id;
	private String sname;
	private Double sfee;

}
