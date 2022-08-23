package com.company.study.ch06;

public class CarSecond {

	String name = "아반떼";
	String color = "red";
	int cc = 1500;
	int pay = 3000;
	
	
	// 오버로드
	CarSecond(String color) {
		this.color = color;
	}
	
	CarSecond(String color, int cc) {
		this.color = color;
		this.cc = cc;
	}
	
	//에러. 동일 이름, 타입으로 생성자 생성 불가
	//CarSecond(String str, int num) {
	//	name = str;
	//	cc = num;
	//}
	
	CarSecond(String name, int cc, String color) {
		this.name = name;
		this.cc = cc;
		this.color = color;
	}
	
	CarSecond(String name, int pay, int cc, String color) {
		this.name = name;
		this.pay = pay;
		this.cc = cc;
		this.color = color;
	}
	
	//기본 생성자
	CarSecond() {}
}
