package com.company.study.ch04;

public class IfExample4 {

	public static void main(String[] args) {
		// int 타입의 변수를 한 개 선언하고
		// 짝수인지 홀수인지 판단하여 결과를 출력하는 프로그램을 작성하시요
		
		int a = 2;
		
		if(a%2 == 0 & a != 0) {
			System.out.println("a는 짝수입니다.");
		} else if(a%2 == 1) {
			System.out.println("a는 홀수입니다.");
		} else {
			System.out.println("a는 0입니다.");
		}
		
		/*
		 int a = 4;
		 
		 if(a != 0) {
		 	if(a%2 == 0) {
		 
		 */

	}

}
