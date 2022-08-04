package com.company.study.ch03;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		
		// && = & : and : 논리곱 : 연산 참 참 참, 나머지 폴스
		// || = | : or  : 논리합 : 연산 참 폴스 참, 폴스 참 참, 참 참 참, 폴스 폴스 폴스
		// ^ : 배타적 논리합 : 연산 참 참 폴스, 폴스 폴스 폴스, 참 폴스 참, 폴스 참 참
		
		int a = 65;
		
		boolean result = (a >= 65);
		System.out.println("result: " + result);
		
		boolean result2 = (a <= 90);
		System.out.println("result2: " + result2);
		
		if(a >= 65 & a <= 90) {
			System.out.println("65보다 크거나 같고 90보다 작습니다.");
		}
		
		if(a >= 65 && a <= 90) {
			System.out.println("65보다 크거나 같고 90보다 작습니다.");
		}
		
		System.out.println("--------------------------------");
		
		if(a >= 65 | a <= 90) {
			System.out.println("둘다 참");
		}
		
		if(a >= 66 | a <= 90) {
			System.out.println("한개만 참");
		}
		
		if(a >= 66 | a <= 50) {
			System.out.println("둘다 폴스");
		}
		
		if(a >= 65 || a <= 90) {
			System.out.println("둘다 참");
		}
		
		if(a >= 66 || a <= 90) {
			System.out.println("한개만 참");
		}
		
		if(a >= 66 || a <= 50) {
			System.out.println("둘다 폴스");
		}
		
		System.out.println("--------------------------------");
		
		if(a >= 65 ^ a <= 50) {
			System.out.println("이렇게 하면 보여진다.");
		}
		
		System.out.println("--------------------------------");
		
		// & | ^ 구현
		
		int b = 999;
		int c = 1000;
		int d = 998;
		
		if(b < c & b > d) {
			System.out.println("1차이 밖에 안나");
		}
		
		if(b < c | b > d) {
			System.out.println("간발의 차이");
		}
		
		if(b > c | b > d) {
			System.out.println("안돼 안돼");
		}
		
		if(b > c | b < d) {
			System.out.println("보이지 않아");
		}
		
		if(b < c ^ b < d) {
			System.out.println("이건 보이지롱");
		}
		

	}//main() end
}//class end
