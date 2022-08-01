package com.company.study.ch02;

public class PromotionExample {

	public static void main(String[] args) {
		
	/*
	 	작은 형이 큰형으로 변환은 문제가 발생하지 않는다.
	 	큰 형이 작은 형으로 변환이 되려면 문제가 생기거나
	 	변환이 이루어져도 데이터 손실이 발생된다
	 	
	 	byte < short < int < long < float < double
	 */
		//자동타입변환(Promotion)
		//강제형변환(Casting)

	byte byteValue = 10;
	System.out.println("byteValue: " + byteValue);
	
	short shortValue = byteValue;
	System.out.println("shortValue: " + shortValue);
		
	// int에 short 대입 후 출력
	
	int intValue = shortValue;
	System.out.println("intValue: " + intValue);
	
	// long에 int 대입 후 출력
	
	long longValue = intValue;
	System.out.println("longValue: " + longValue);
	
	// float에 long 대입 후 출력
	
	float floatValue = longValue;
	System.out.println("floatValue: " + floatValue);
	
	// double에 float 대입 후 출력
	
	double doubleValue = floatValue;
	System.out.println("doubleValue: " + doubleValue);
	
	/*
	int intValue2 = 1234567890;
	System.out.println("intValue: " + intValue);
	
	byte byteValue2 = (byte) intValue2;
	System.out.println("byteValue2: " + byteValue2 + "입니다!!!");
	
	int intValue3 = 200;
	System.out.println("intValue3: " + intValue3 + "입니다!!!");
	
	double doubleValue = intValue3;
	System.out.println("doubleValue: " + doubleValue + "입니다!!!");
	*/
	
	
	}
}
