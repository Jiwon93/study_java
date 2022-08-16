package com.company.study.ch04;


public class RandomSum2 {

	public static void main(String[] args) {
		// 1~100 사이의 랜덤한 두 정수 사이의 합을 구하시오.
		
		int num1 = 1;
		int num2 = 100;
		int min = 0, max = 0, sum = 0;
		
		int random1 = (int) (Math.random() * (num2-num1)+num1); // 랜덤정수1
		int random2 = (int) (Math.random() * (num2-num1)+num1); // 랜덤정수2
		
		if(random1>random2) {
			min = random2;
			max = random1;
		} else {
			min = random1;
			max = random2;
		}

		for(int i=min; i<=max; i++) {
			sum += i;
			System.out.println(i + " : " + sum);
		}
		
		System.out.println("두 수 사이의 합: " + sum);
	}

}
