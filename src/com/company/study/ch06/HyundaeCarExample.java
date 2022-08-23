package com.company.study.ch06;

public class HyundaeCarExample {

	public static void main(String[] args) {
		
		HyundaeCar hyundaecar = new HyundaeCar();
		
		hyundaecar.hyundaecar();
		
		for(int i=0; i<hyundaecar.name.length; i++) {
			System.out.println("hyundaecar:" + hyundaecar.name[i]);
		}
		
	}

}
