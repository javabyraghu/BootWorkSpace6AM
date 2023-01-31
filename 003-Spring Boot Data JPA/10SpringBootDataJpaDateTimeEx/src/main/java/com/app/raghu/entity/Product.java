package com.app.raghu.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="prdatab")
public class Product {
	@Id
	@Column(name="pid")
	private Integer pid;
	@Column(name="pcode")
	private String pcode;
	
	@Temporal(TemporalType.DATE)
	@Column(name="pmfgdte")
	private Date mfgDate; //date
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="pexpdte")
	private Date expDate; //date+time
	
	@Temporal(TemporalType.TIME)
	@Column(name="pexptim")
	private Date exportedTime; //time
}
