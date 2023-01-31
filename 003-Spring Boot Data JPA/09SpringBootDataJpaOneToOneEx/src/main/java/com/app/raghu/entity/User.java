package com.app.raghu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="usertab")
public class User {
	@Id
	@Column(name="uid")
	private Integer usrId;
	
	@Column(name="uname")
	private String userName;
	
	@Column(name="upwd")
	private String userPwd;
	
	/*
	@ManyToOne
	@JoinColumn(name="pidFk",unique=true)
	private Profile pob; 
	*/
	
	
	@OneToOne
	@JoinColumn(name="pidFk")
	private Profile pob; //HAS-A
}
