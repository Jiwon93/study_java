package com.company.study.ch06;

public class HyundaeCar {
	
	String[] name = {"아반떼","소나타","그랜져","투싼","싼타페"};

	public void hyundaecar() {
		for(int i=0; i<name.length; i++) {
			System.out.println("hyundaecar.name: " + name[i]);
		}
		// 함수 내부에는 return을 써준다 int는 1, String은 ""을 넣어줌.
		
	}
	
}
