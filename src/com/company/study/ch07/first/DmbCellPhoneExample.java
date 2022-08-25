package com.company.study.ch07.first;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		
		//부모 객체를 생성하고 powerOn 메서드 실행
		
		CellPhone cellPhone = new CellPhone();
		cellPhone.powerOn();
		
		//자식 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone();
		
		//자식 객체의 turnOffDmb 실행
		dmbCellPhone.turnOffChannel();
		
		//생성자를 이용하여 자식 객체 생성
		DmbCellPhone dmbCellPhone2 = new DmbCellPhone("애플", "13pro", "space gray", 87);
	
		//dmbCellPhone2 객체를 사용하여 자식 클래스의 함수 전체 호출
		dmbCellPhone2.changeChannel(78);
		dmbCellPhone2.turnOffChannel();
		dmbCellPhone2.turnOnChannel();
		
		//dmbCellPhone2 객체를 사용하여 부모 클래스의 함수 전체 호출
		dmbCellPhone2.bell();
		dmbCellPhone2.hangUp();
		dmbCellPhone2.powerOff();
		dmbCellPhone2.powerOn();
		dmbCellPhone2.sendMessage("뭐하냐");
		dmbCellPhone2.recieveMessage("왜");
	}

}
