package com.app.raghu.bean;

public class ExcelExport {

	private String fileName;
	private String fileExt;
	
	public ExcelExport() {
		super();
		System.out.println("FROM CONSTRUCTOR");
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
		System.out.println("FROM SETTER METHOD");
	}

	public String getFileExt() {
		return fileExt;
	}

	public void setFileExt(String fileExt) {
		this.fileExt = fileExt;
	}

	@Override
	public String toString() {
		return "ExcelExport [fileName=" + fileName + ", fileExt=" + fileExt + "]";
	}

	public void setup() {
		System.out.println("FROM INIT METHOD");
	}
	
	public void clear() {
		System.out.println("FROM DESTORY METHOD");
	}
	
	
}
