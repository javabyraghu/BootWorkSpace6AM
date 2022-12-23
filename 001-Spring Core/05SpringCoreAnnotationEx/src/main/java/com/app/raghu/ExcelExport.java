package com.app.raghu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("exObj")
public class ExcelExport {
	
	@Value("TEST")
	private String exportName;
	
	@Value("csv")
	private String fileExt;
	
	@Override
	public String toString() {
		return "ExcelExport [exportName=" + exportName + ", fileExt=" + fileExt + "]";
	}
	
	
}
