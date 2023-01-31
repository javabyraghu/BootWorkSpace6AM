package com.app.raghu.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="stdtab")
public class Student {
	@Id
	@Column(name="sid")
	private Integer stdId;
	@Column(name="sname")
	private String stdName;
	@Column(name="saddr")
	private String stdAddr;
	
	@ManyToMany
	@JoinTable(name="stdcrstab",
	joinColumns = @JoinColumn(name="sidfk"),
	inverseJoinColumns = @JoinColumn(name="cidfk")
	)
	private List<Course> cobs;
	
}
