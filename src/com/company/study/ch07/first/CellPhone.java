package com.company.study.ch07.first;

public class CellPhone {

	//부모
	
		//필드
		String brand;
		String model;
		String color;
		
		
		//생성자
		CellPhone() {
		}
		
		//메소드
		void powerOn() {
			System.out.println("전원이 켜졌습니다.");
		}
		
		void powerOff() {
			System.out.println("전원이 꺼졌습니다.");
		}
	
		void bell() {
			System.out.println("알람이 울립니다.");
		}
		
		void hangUp() {
			System.out.println("전화를 끊습니다.");
		}
		
		void sendMessage(String message) {
			System.out.println("나: " + message);
		}
		
		void recieveMessage(String message) {
			System.out.println("상대방: " + message);
		}
		
		
}
