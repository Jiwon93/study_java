package com.company.study.ch06;

public class KoreanExample {

	public static void main(String[] args) {
		
		Korean k1 = new Korean("신지원", "001231-1234567");
		System.out.println("이름: " + k1.name);
		System.out.println("주민번호: " + k1.ssn);
		
		Korean k2 = new Korean("신지원", 22);
		System.out.println("이름: " + k2.name);
		System.out.println("나이: " + k2.age);
		
		System.out.println(k1.nationality);
		System.out.println(Korean.nationality);
		
		int result = Korean.staticTest(90);
		System.out.println(result);
		
		// 에러. Korean 클래스에 static으로 생성되지 않았음.
		//int result2 = Korean.staticTest2(0);
		//System.out.println(result2);
		
		
		
		
	}

}
