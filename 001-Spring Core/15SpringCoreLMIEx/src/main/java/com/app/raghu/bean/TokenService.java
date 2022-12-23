package com.app.raghu.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TokenService {

	@Autowired
	private Token tokenOb;
	
	@Lookup
	public Token linkNewChildObj() {
		return null;
	}
	
	public Token getTokenOb() {
		this.tokenOb = linkNewChildObj();
		return tokenOb;
	}

	@Override
	public String toString() {
		return "TokenService [tokenOb=" + tokenOb + "]";
	}
	
	
}
