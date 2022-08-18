package com.company.study.ch05;

public class EnumWeekExample {

	public static void main(String[] args) {
		
		Week abc;
		Week xyz;
		
		// abc = Week.MONDAY;
		
		
		// 정해진 상수는 바꿀 수 없다.
		// abc = 1; 에러.
		// abc = "월요일"; 에러.
		// abc = 1.5; 에러. 
		
		abc = Week.MONDAY;
		
		System.out.println("Week.FRIDAY: " + Week.FRIDAY);
		System.out.println("abc: " + abc);
		
		// String name = abc; 에러. 
		String name = abc.name();
		System.out.println("name: " + name);
		
		int ordinal = abc.ordinal(); // 인덱스 값을 가져옴
		System.out.println("ordinal: " + ordinal); // MONDAY = 0
		
		xyz = Week.THURSDAY;
		
		int result1 = abc.compareTo(xyz);
		int result2 = xyz.compareTo(abc);
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		
		Week[] days = Week.values();
		
		int index = 0;
		for(Week day: days) { // for(단수 : 복수)
			System.out.println(index + ": day: " + day);
			index++;
		}
	}
}
