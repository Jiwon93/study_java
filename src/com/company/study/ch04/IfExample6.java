package com.company.study.ch04;

public class IfExample6 {

	public static void main(String[] args) {
		// int 타입의 변수를 3개 선언하고
		// 세 정수중에서 최대값 최소값을 구하는 프로그램을 작성하시오
		
		
		int a = 1;
		int b = 2;
		int c = 3;
		
		if(a != b & b != c & c != a) {
			if(a > b & a > c) {
				System.out.println("최대값은 a: " + a);
			} else if(b > a & b > c) {
				System.out.println("최대값은 b: " + b);
			} else {
				System.out.println("최대값은 c: " + c);
			}
			
			if(a < b & a < c) {
				System.out.println("최소값은 a: " + a);
			} else if(b < a & b < c) {
				System.out.println("최소값은 b: " + b);
			} else {
				System.out.println("최소값은 c: " + c);
			}
		} else {
			System.out.println("적어도 2개의 동일한 정수가 존재 합니다. 수정해 주세요.");
		}
		
		/*
		 내가 한 것
		int a = 1;
		int b = 2;
		int c = 3;
		
	
		if(a > b & a > c) {
			if(b > c) {
			System.out.println("최대값: a, 최소값: c");
			} else if(c > b) {
				System.out.println("최대값: a, 최소값: b");
			}
		} else if(b > a & b > c) {
			if(a > c) {
				System.out.println("최대값: b, 최소값: c");
				} else if(c > a) {
					System.out.println("최대값: b, 최소값: a");
				}
		} else if(c > a & c > b) {
			if(a > b) {
				System.out.println("최대값: c, 최소값: b");
				} else if(b > a) {
					System.out.println("최대값: c, 최소값: a");
				}
		} else {
			System.out.println("값이 같거나 비교할 수 없다.");
		}
		*/

	}

}
