package com.company.study.ch04;

public class IfExample2 {

	public static void main(String[] args) {
		rank(1,10000);
		rank(2,10000);
		rank(3,10000);
		rank(4,10000);
		rank(5,10000);
		
	}//main() end
	
	
	
	public static void rank(int r, int price) {
		
		
		if(r == 1) {
			double sale = price*(1-0.05);
			System.out.println("일반: " + (int)sale + "원(할인가)" + " | " + price + "원(정가)");
		} else if(r == 2) {
			double sale = price*(1-0.10);
			System.out.println("브론즈: " + (int)sale + "원(할인가)" + " | " + price + "원(정가)");
		} else if(r == 3) {
			double sale = price*(1-0.15);
			System.out.println("실버: " + (int)sale + "원(할인가)" + " | " + price + "원(정가)");
		} else if(r == 4) {
			double sale = price*(1-0.20);
			System.out.println("골드: " + (int)sale + "원(할인가)" + " | " + price + "원(정가)");
		} else if(r == 5) {
			double sale = price*(1-0.027);
			System.out.println("플래티넘: " + (int)sale + "원(할인가)" + " | " + price + "원(정가)");
		} else {
			System.out.println("비회원: " + price + "원(정가)");
		}
	}
}
