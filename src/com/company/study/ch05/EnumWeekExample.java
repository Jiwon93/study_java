package com.company.study.ch05;

public class EnumWeekExample {

	public static void main(String[] args) {
		
		Week abc;
		
		abc = Week.MONDAY;
		
		
		// 정해진 상수는 바꿀 수 없다.
		// abc = 1; 에러.
		// abc = "월요일"; 에러.
		// abc = 1.5; 에러. 
		
		System.out.println("Week.FRIDAY: " + Week.FRIDAY);
		System.out.println("abc: " + abc);

	}
}
