package com.company.study.ch06;

public class IphoneExample {

	public static void main(String[] args) {
		
		Iphone iphone = new Iphone();
		
		System.out.println("iphone.name: " + iphone.name);

		Car car = new Car();
		
		System.out.println("car.name: " + car.name);
		
		car.name = "투싼";
		
		System.out.println("car.name: " + car.name);
	
		iphone.pr();
		
		Handbag handbag = new Handbag();
		
		System.out.println("handbag.name: " + handbag.name);
		
		Watch watch = new Watch();
		System.out.println("watch.name: " + watch.name);
	}

}
