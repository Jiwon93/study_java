package com.company.study.ch04;

public class RandomSum {

	public static void main(String[] args) {
		// 1~100 사이의 랜덤 정수 2개를 발생시켜
		// 두 수 사이의 합을 구하라
		
		double num1 = 1;
		double num2 = 100;
		int sum = 0, min = 0, max = 0;
		int random = (int) ((Math.random() * (num2-num1)) + num1);
		int random2 = (int) ((Math.random() * (num2-num1)) + num1);
		
		if(random > random2) {
			max = random;
			min = random2;
		} else {
			max = random2;
			min = random;
		}
		
		for(int i = min; i <= max; i++) {
			sum += i;
			System.out.println(i + " : " + sum);
		}
		
		System.out.println("두개의 랜덤 정수 사이 값의 합: " + sum);
		
//		여기서 부터 정민님 소스
//		Random rand = new Random();
//		
//		int num1 = rand.nextInt(100);
//		int num2 = rand.nextInt(100);
//		
//		int sum = 0;
//		
//		if(num1 > num2) {
//			for(int i = num2 ; i <= num1; i++) {
//				sum += i;
//				System.out.print(i + " + ");
//				if(i == num1) System.out.print(i + " ");
//			}
//			System.out.print(" = " + sum);
//		} else {
//			for(int i = num1 ; i <= num2; i++) {
//				sum += i;
//				System.out.print(i + " + ");
//				if(i == num2) System.out.print(i + " ");
//			}
//			System.out.print(" = " + sum);
////			System.out.println(num1 + " ~ " + num2 + " 사이의 합은 " + sum);
//		}
	}

}
