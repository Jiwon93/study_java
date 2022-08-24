package com.company.study.ch06;

public class Board {
	
	String name = "신지원";
	int views = 1;
	Boolean useOrNot = true;
	
	// 기본생성자
	Board() {
		
	}
	
	// 생성자1(이름)
	Board(String name) {
		this.name = name;
	}
	
	// 생성자2(이름, 조회수)
	Board(String name, int views) {
		this.name = name;
		this.views = views;
	}
	
	// 생성자3(이름, 사용여부)
	Board(String name, Boolean useOrNot) {
		this.name = name;
		this.useOrNot = useOrNot;
	}
	
	// 생성자4(이름, 조회수, 사용여부)
	Board(String name, int views, Boolean useOrNot) {
		this.name = name;
		this.views = views;
		this.useOrNot = useOrNot;
	}
	
	public void say() {
		System.out.println("이름: " + name + ", " + "조회수: " + views + ", " + "사용여부: " + useOrNot);
	}
	
}
