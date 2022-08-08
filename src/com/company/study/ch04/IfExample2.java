package com.company.study.ch04;

public class IfExample2 {

	public static void main(String[] args) {
		
		int rank = 4;
		
		int price = 1000; 
		
		if(rank == 1) {
			System.out.println("정가: " + price + " : " + "할인가: " + price*0.95);
		} else if(rank == 2) {
			System.out.println("정가: " + price + " : " + "할인가: " + price*0.90);
		} else if(rank == 3) {
			System.out.println("정가: " + price + " : " + "할인가: " + price*0.85);
		} else if(rank == 4) {
			System.out.println("정가: " + price + " : " + "할인가: " + price*0.80);
		} else {
			System.out.println("정가: " + price + " : " + "할인가: " + price*0.73);
		}
		
	}
}
