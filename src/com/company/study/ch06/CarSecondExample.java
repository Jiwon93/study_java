package com.company.study.ch06;

public class CarSecondExample {

	public static void main(String[] args) {
		
		CarSecond carSecond = new CarSecond();
		String color;
		String name;
		int cc;
		
		CarSecond carSecond2 = new CarSecond("yellow");
		CarSecond carSecond3 = new CarSecond("green", 4000);
		String color2 = "red";
		
		CarSecond carSecond4 = new CarSecond("그랜져", 4000, 3000, "black");
		CarSecond carSecond5 = new CarSecond("아반떼", 1500, "white");

		System.out.println(carSecond2.color);
		System.out.println(carSecond.color);
		System.out.println(carSecond3.color);
		System.out.println(carSecond3.cc);
		
		System.out.println("현대 신차: ");
		System.out.print(carSecond4.name+"/");
		System.out.print(carSecond4.pay + "만원"+"/");
		System.out.print(carSecond4.cc + "cc"+"/");
		System.out.println(carSecond4.color);
	
		System.out.print(carSecond5.name+"/");
		System.out.print(carSecond5.cc+"/");
		System.out.println(carSecond5.color);
		
		System.out.print(carSecond.name+"/");
		System.out.print(carSecond.pay+"/");
		System.out.print(carSecond.cc+"/");
		System.out.println(carSecond.color);
	}

}
