package com.company.study.ch06;

public class Korean {
	
	Korean() {}

	String name = "이름";
	String ssn = "주민등록번호";
	int age = 30;
	
	Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	Korean(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	static String nationality = "대한민국";
	
	static int staticTest(int a) {
		return a + 10;
	}
	
	// static 설정하지 x
	int staticTest2(int a) {
		return a - 10;
	}
	
	int ttest() {
		Arithmetic arithmetic = new Arithmetic();
		arithmetic.chulruk(12);
		return 1;
	}
	
	public void ttest2() {
		Arithmetic.staticTest();
	}
}
