package com.app.raghu;

public class MyDbCon {

	private String driver;
	private String url;
	
	public MyDbCon() {
		super();
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "MyDbCon [driver=" + driver + ", url=" + url + "]";
	}
	
	
}
