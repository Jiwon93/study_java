package com.company.study.ch03;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		String str1 = "신지원";
		String str2 = "신지원";
		String str3 = new String("신지원");
		
		boolean result1 = (str1 == str2);
		System.out.println("result1=" + result1);  //true
		
		boolean result2 = (str1 == str3);
		System.out.println("result2=" + result2);  //false
		
		// String(참조, 객체)은 메모리에 저장되어 메모리로 비교
		// new로 새로 객체를 생성한 경우는 같은 값이라도 다른 메모리로 저장
		// .equals()을 사용하여 비교
		// 객체명.함수() --> 객체에는 함수라는 것이 존재(다양한 기능 포함).
		System.out.println("str1.equals(str2): " + str1.equals(str2)); // ==(x) true
		System.out.println("str1.equals(str3): " + str1.equals(str3)); // ==(x) true
		
	}//main() end
}//class end
