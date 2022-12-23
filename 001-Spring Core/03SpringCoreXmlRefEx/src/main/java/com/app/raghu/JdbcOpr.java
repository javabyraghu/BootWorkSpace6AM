package com.app.raghu;

public class JdbcOpr {

	private MyDbCon con;

	public JdbcOpr() {
		super();
	}

	public MyDbCon getCon() {
		return con;
	}

	public void setCon(MyDbCon con) {
		this.con = con;
	}

	@Override
	public String toString() {
		return "JdbcOpr [con=" + con + "]";
	}
	
	
}
