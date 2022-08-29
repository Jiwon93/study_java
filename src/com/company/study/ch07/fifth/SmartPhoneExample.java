package com.company.study.ch07.fifth;

public class SmartPhoneExample {

	public static void main(String[] args) {
		
		// 에러. 추상클래스는 new로 생성되지 않는다.
		// Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("asdf");
		
		smartPhone.internetSearch();
		smartPhone.turnOff();
		smartPhone.turnOn();

	}

}
