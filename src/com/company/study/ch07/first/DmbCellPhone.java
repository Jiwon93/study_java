package com.company.study.ch07.first;

public class DmbCellPhone extends CellPhone {
	
	int channel;
	
	DmbCellPhone(String brand, String model, String color, int channel) {
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.channel = 1;
	}
	
	DmbCellPhone() {
	}
	
	void turnOnChannel() {
		powerOn();
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	
	void turnOffChannel() {
		powerOff();
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 종료합니다.");
	}
	
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel + "번으로 변경합니다.");
	}

}
