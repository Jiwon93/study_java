package com.company.study.ch04;

public class ForExample {

	public static void main(String[] args) {
		
		
		// **********
		// **********
		// **********
		// **********
		// **********
		// 출력하는 프로그램을 만드시오
		
		/*
		for(int i=0; i<=4; i++) {
			System.out.println("**********");
		}
		*/
		
		for(int i=1; i<=50; i++) {
			System.out.print("*");
			if(i%10 == 0) {
				System.out.println("");
			}
		}
		
		System.out.println("-----------------");
		
		// **********
		// *        *
		// *        *
		// *        *
		// **********
		// 출력하는 프로그램을 만드시오
		
		/*
		for(int i=0; i<=4; i++) {
			if(i == 0 | i == 4) {
				System.out.println("**********");
			} else {
				System.out.println("*        *");
			}
		}
		*/
		
		
		System.out.println("-----------------");
		
		// 1
		// 12
		// 123
		// 1234
		// 12345
		// 123456
		// 1234567
		// 12345678
		// 123456789
		// 1 3 5 7 90
		// 출력하는 프로그램을 만드시오
		
		String s = "";
		
		for(int i=1; i<=10; i++) {
			if(i==10) {
				s = "";
				for(int j=1; j<=10; j++) {
					if(j==10) {
						s += "0";
					} else {
						if(j%2 == 1) {
							s += Integer.toString(j);
						} else {
							s += " ";
						}
					}
				}
				System.out.println(s);
			} else {
				s += Integer.toString(i);
				System.out.println(s);
			}
		}
		
	}
}
