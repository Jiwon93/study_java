package com.company.study.ch04;

public class IfExample {

	public static void main(String[] args) {
	
		int score = 90;
		
		if(score >= 90) {
			if(score >= 97) {
				System.out.println("A+");
			} else if(score <= 92) {
				System.out.println("A-");
			} else {
				System.out.println("A");
			}
		} else if(score >= 80 & score < 89) {
			System.out.println("B");
		} else if(score >= 70 & score < 79) {
			System.out.println("C");
		} else if(score >= 60 & score < 69) {
			System.out.println("D");
		} else if(score >= 50 & score < 59) {
			System.out.println("E");
		} else {
			System.out.println("A는 아니구나");
		}
		
	}
}
