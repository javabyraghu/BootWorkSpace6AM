package com.app.raghu.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ordertab")
public class Order {
	@Id
	@Column(name="orid")
	private Integer ordId;
	@Column(name="ormode")
	private String ordMode;
	@Column(name="ordisc")
	private Double discount;
	
	@OneToMany
	@JoinColumn(name="ordIdFk")
	private List<Product> pobs;//HAS-A
	
}
