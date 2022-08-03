package com.company.study.ch03;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		
	// int 변수 v1 에 초기값 5
	// int 변수 v2 에 초기값 2
	int v1 = 5;
	int v2 = 2;
	
	// int 변수 result1 에 + 연산 후 출력
	// int 변수 result2 에 - 연산 후 출력
	// int 변수 result3 에 * 연산 후 출력
	// int 변수 result4 에 / 연산 후 출력
	// int 변수 result5 에 % 연산 후 출력

	int result1 = v1 + v2;
	System.out.println("reuslt1: " + result1);
	
	int result2 = v1 - v2;
	System.out.println("reuslt2: " + result2);
	
	int result3 = v1 * v2;
	System.out.println("reuslt3: " + result3);
	
	int result4 = v1 / v2;
	System.out.println("reuslt4: " + result4);
	
	int result5 = v1 % v2;
	System.out.println("reuslt5: " + result5);
	
	double result6 = v1 / v2;
	System.out.println("result6: " + result6);
	
	double result7 = (double) v1 / v2;
	System.out.println("result7: " + result7);
	
	
	double a = (double) 5/3;
	double b = (double) 5/8;
	double c = (double) 49/5;
	double cal1 = (double) (a-b)*c;
	
	System.out.println("a= " + a);
	System.out.println("b= " + b);
	System.out.println("c= " + c);
	
	System.out.println("(5/3-5/8)*49/5 = " + cal1);
			
	int d = 5;
	double e = (double) 3.25;
	double f = (double) 11/6;
	double g = (double) 12/17;
	double cal2 = (double) d-(e-f)*g;
	
	System.out.println("d= " + d);
	System.out.println("e= " + e);
	System.out.println("f= " + f);
	System.out.println("g= " + g);
	
	System.out.println("5-(3.25-11/6)*12/17 = " + cal2);
	
	int sum1 = 8+7+5;
	System.out.println("8 + 7 + 5 = " + sum1);
	
	int sum2 = 1+9+5;
	System.out.println("1 + 9 + 5 = " + sum2);
	
	int sum3 = 5+6+6;
	System.out.println("5 + 6 + 6 = " + sum3);
	
	int sum4 = 4+7+1;
	System.out.println("4 + 7 + 1 = " + sum4);
	
	int sum5 = 7+5+5;
	System.out.println("7 + 5 + 5 = " + sum5);
	
	
	sum(8, 7, 5);
	sum(1, 9, 5);
	sum(5, 6, 6);
	sum(4, 7, 1);
	sum(7, 7, 5);
	
	avg("홍길동", 60, 70, 85, 90, 45);
	avg("박달순", 50, 75, 70, 60, 70);
	avg("고장난", 55, 60, 64, 58, 90);
	avg("도룡뇽", 80, 70, 63, 88, 78); 
	
	
	}//main() end
	
	//메인함수 아닌 함수의 위치 : 클래스와 메인함수 end 사이
	public static void sum(int a, int b, int c) {
		
		System.out.println(a+ "+" + b + "+" + c + "=" + (a+b+c) );
	}//end
	
	public static void avg(String name, int english, int math, int physics, int music, int athletic) {
		
		System.out.println(name + ": " +  "영어: " +english +",수학: " +math +",물리: " +physics +",음약: " + music +",체육: " +athletic);
		System.out.println("평균: " + (double)(english+math+physics+music+athletic)/5);
	}
	
}//class end
