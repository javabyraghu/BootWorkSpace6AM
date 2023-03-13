package com.app.raghu.bean;

public class CartInfo {

	private String code;
	private Double amt;
	
	public CartInfo() {
		super();
	}
	
	
	public CartInfo(String code, Double amt) {
		super();
		this.code = code;
		this.amt = amt;
	}


	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Double getAmt() {
		return amt;
	}
	public void setAmt(Double amt) {
		this.amt = amt;
	}
	
	
}
