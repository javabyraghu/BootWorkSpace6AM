package com.app.raghu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "emptab")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "eid")
	private Integer empId;

	@Column(name = "ename", length = 50)
	private String empName;

	@Column(name = "egen", length = 10, nullable = false)
	private String empGen;

	@Column(name = "esal")
	private Double empSal;

	@Column(name = "edept", length = 10)
	private String empDept;

	@Column(name = "eaddr", length = 100, nullable = false)
	private String empAddr;

}
