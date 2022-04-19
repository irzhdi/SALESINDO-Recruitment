package com.juaracoding.cucumber4.utlis;

public enum TestCases {

	T1("Testing Login user recruitment"),
	T2("Testing menu Dashboard"),
	T3("Testing menu Wawancara");
	
	private String testName;
	
	TestCases(String value){
		this.testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
