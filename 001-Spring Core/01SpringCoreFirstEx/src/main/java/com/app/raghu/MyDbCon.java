package com.app.raghu;

public class MyDbCon {

	private String driver;
	private String url;
	//Source > Generate Constructor using Fields > Deselect All > Generate
	public MyDbCon() {
		super();
		System.out.println("HELLO FROM CONSTRUCTOR");
	}
	//Source > Generate setters/getters > Select All > Generate
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
		System.out.println("HELLO FROM SETTER METHOD");
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	//Source > Generate toString > Generate
	@Override
	public String toString() {
		return "MyDbCon [driver=" + driver + ", url=" + url + "]";
	}
	
	
	
}
