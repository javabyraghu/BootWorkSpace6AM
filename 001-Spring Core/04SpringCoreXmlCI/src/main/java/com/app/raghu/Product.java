package com.app.raghu;

import java.util.List;

public class Product {

	private String pcode;
	private String model;
	private List<String> data;
	private Vendor vob;
	
	// Source > Generate Constructor Using Fields > Select All > Generate
	public Product(String pcode, String model, List<String> data, Vendor vob) {
		super();
		this.pcode = pcode;
		this.model = model;
		this.data = data;
		this.vob = vob;
	}

	// Source > Generate toString > Generate
	@Override
	public String toString() {
		return "Product [pcode=" + pcode + ", model=" + model + ", data=" + data + ", vob=" + vob + "]";
	}
	
}
