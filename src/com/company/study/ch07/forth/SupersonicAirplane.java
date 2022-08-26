package com.company.study.ch07.forth;

public class SupersonicAirplane extends Airplane {
	
	// 상수는 변수명 대문자로 복합단어는 _ 사용.
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			super.fly();
		}
	}
	
}
