package com.app.raghu.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="prodtab")
public class Product {
	@Id
	@Column(name="pid")
	private Integer prodId;
	@Column(name="pname")
	private String prodName;
	
	@ElementCollection
	@CollectionTable(
		name="prod_vendors",
  	joinColumns = @JoinColumn(name="pidFk")
	)
	@Column(name="vendor")
	private Set<String> vendors;
	
	
	@ElementCollection
	@CollectionTable(
		name="prod_version",
	joinColumns = @JoinColumn(name="pidFk")
	)
	@OrderColumn(name="pos") //index column
	@Column(name="version")
	private List<String> versions;
	
	
	@ElementCollection
	@CollectionTable(
			name="prod_clients",
	joinColumns = @JoinColumn(name="pidFk")	
	)
	@MapKeyColumn(name="code")
	@Column(name="cname")
	private Map<String,String> clients;
	
	
}
