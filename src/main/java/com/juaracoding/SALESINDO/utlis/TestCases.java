package com.juaracoding.SALESINDO.utlis;

public enum TestCases {

	T1("Testing Login user recruitment"),
	T2("Testing menu Dashboard"),
	T3("Testing menu Wawancara"),
	T4("Testing Menu Verifikasi"),
	T5("Testing Menu Jadwal Training"),
	T6("Testing Menu Coding"),
	T7("Testing Menu Session");
	
	private String testName;
	
	TestCases(String value){
		this.testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
