package com.company.study.ch07.forth;

public class SupersonicAirplanExample {

	public static void main(String[] args) {
		
		SupersonicAirplane supersonicAirplane = new SupersonicAirplane();
		
		supersonicAirplane.takeoff();
		supersonicAirplane.fly();
		supersonicAirplane.flyMode = SupersonicAirplane.SUPERSONIC;
		supersonicAirplane.fly();
		supersonicAirplane.flyMode = SupersonicAirplane.NORMAL;
		supersonicAirplane.fly();
		supersonicAirplane.land();
		
		
		// 상수 파일 생성 후 코드
		supersonicAirplane.takeoff();
		supersonicAirplane.fly();
		supersonicAirplane.flyMode = Constants.SUPERSONIC;
		supersonicAirplane.fly();
		supersonicAirplane.flyMode = Constants.NORMAL;
		supersonicAirplane.fly();
		supersonicAirplane.land();
	}

}
