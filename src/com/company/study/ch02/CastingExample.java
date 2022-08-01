package com.company.study.ch02;

public class CastingExample {

	public static void main(String[] args) {
		
		// 강제 형변환 : casting : (원하는 형) 변수명
		
		double doubleValue = 1234567;
		System.out.println("doubleValue: " +  doubleValue);
		
		double doubleValue2 = 1234567891;     // 7자리 이상인 경우에는 e로 표현됨
		System.out.println("doubleValue2: " + doubleValue2);

		
		// float 변수에 double 대입
		float floatValue = (float) doubleValue;
		System.out.println("floatValue: " + floatValue);
		
		// long 변수에 float 대입
		long longValue = (long) floatValue;
		System.out.println("longValue: " + longValue);
		
		// int 변수에 long 대입
		int intValue = (int) longValue;
		System.out.println("intValue: " + intValue);
		
		// short 변수에 int 대입
		short shortValue = (short) intValue;
		System.out.println("shortValue: " + shortValue);
		
		// byte 변수에 short 대입
		byte byteValue = (byte) shortValue;
		System.out.println("byteValue: " + byteValue);
		
		
		// int(원시형), Integer(참조형)
		// int 변수를 String으로 변환
		int int1 = 123;
		int int2 = -123;
		
		String str3 = Integer.toString(int1);
		String str4 = String.valueOf(int2); //주로 사용됨
		
		System.out.println(str3);
		System.out.println(str4);
		
		// String 변수를 int로 변환
		String str1 = "123";
		String str2 = "-123";
		
		int intValue2 = Integer.parseInt(str1); //주로 사용됨
		int intValue3 = Integer.valueOf(str2);
		
		System.out.println(intValue2);
		System.out.println(intValue3);
		
		/*
		 	*사칙연산
		 	작은형 (사칙연산) 큰형 = 큰형(데이터타입)
		 	-> int보다 작은 형들은 int로 치환되어짐. 
		 */
	}

}
