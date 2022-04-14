package com.thepracticaldeveloper.jbosswildflydemo;

public class Fin {

	private Long code;
	
	public Fin(long long1, String string) {
		this.code= long1;
		this.type=string;
	}
	@Override
	public String toString() {
		return "Fin [code=" + code + ", type=" + type + "]";
	}
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	private String type;
	
}
