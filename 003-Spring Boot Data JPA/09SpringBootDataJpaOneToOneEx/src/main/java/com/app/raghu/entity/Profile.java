package com.app.raghu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="proftab")
public class Profile {
	
	@Id
	@Column(name="pid")
	private Integer prfId;
	
	@Column(name="pcode")
	private String actCode;
	
	@Column(name="pdsg")
	private String desgn;
	
}
