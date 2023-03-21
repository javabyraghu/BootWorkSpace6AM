package com.app.raghu.util;

import org.springframework.stereotype.Component;

import com.app.raghu.entity.Stock;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class JsonUtil {
	/**
	 * This method converts Object to JSON Format 
	 */
	public String convertObjToJson(Stock stock) {
		String str = null;
		try {
			str = new ObjectMapper().writeValueAsString(stock);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return str;
	}
	
	/***
	 * This method converts JSON String to Object format 
	 */
	public Stock convertJsonToObject(String json) {
		Stock obj =  null; 
		try {
			obj = new ObjectMapper().readValue(json, Stock.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}
}
