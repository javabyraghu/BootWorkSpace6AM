package com.app.raghu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="emptab")
public class Employee {

	//@GeneratedValue(strategy = GenerationType.AUTO)
	//private Integer empId;
	
	@Id
	@GeneratedValue(generator = "testgen")
	@GenericGenerator(name = "testgen", 
		strategy = "com.app.raghu.generator.MyCustGen")
	@Column(name="eid")
	private String empId;
	
	@Column(name="ename")
	private String empName;
	
	@Column(name="esal")
	private Double empSal;
	
	@Column(name="edept")
	private String empDept;
	
}