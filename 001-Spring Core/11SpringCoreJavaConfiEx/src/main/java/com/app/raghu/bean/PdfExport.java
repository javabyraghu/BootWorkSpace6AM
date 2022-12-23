package com.app.raghu.bean;

public class PdfExport {

	private String fileName;
	private String fileAuth;
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileAuth() {
		return fileAuth;
	}
	public void setFileAuth(String fileAuth) {
		this.fileAuth = fileAuth;
	}
	@Override
	public String toString() {
		return "PdfExport [fileName=" + fileName + ", fileAuth=" + fileAuth + "]";
	}
	
	
}
