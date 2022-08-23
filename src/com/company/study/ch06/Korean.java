package com.company.study.ch06;

public class Korean {
	
	Korean() {}

	String name = "이름";
	String ssn = "주민등록번호";
	String nationality = "국가";
	int age = 30;
	
	Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	Korean(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}
