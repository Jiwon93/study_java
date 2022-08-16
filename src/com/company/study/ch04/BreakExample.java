package com.company.study.ch04;

public class BreakExample {

	public static void main(String[] args) {
		// 예제
		
		double min = 1.0;
		double max = 10.0;
		
		while(true) {
			int random = (int) (Math.random() * (max-min)+min);
			System.out.println(random);
			
			if(random == 5) {
				break;
			}//if end
		}//while end
		
		System.out.println("-------------------------");
		
		for(int i=1; i<=10; i++) {
			int random2 = (int) (Math.random() * (max-min)+min);
			System.out.println(i + " : " + random2);
			if(random2 == 5) {
				break;
			}
		}
		
		System.out.println("--------------------------");
		
		aa: // aa문 자체를 빠져나오게 하는 것. 
		for(int j=1; j<=10; j++) {
			for(int i=1; i<=10; i++) {
				int random3 = (int) (Math.random() * (max-min)+min);
				System.out.println(j + " : " + i + " : " + random3);
				if(random3 == 5) {
					break aa;
				}
			}
		}
	}

}
