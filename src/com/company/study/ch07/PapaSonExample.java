package com.company.study.ch07;

public class PapaSonExample {

	public static void main(String[] args) {
		
		Papa papa = new Papa();
		
		papa.PapaArray(3, 5, 7);
		int result = papa.PapaSum(3, 5, 7);
		System.out.println("부모 클래스 메서드2 값: " + result);
		
		Son son = new Son();
		
		//int[] arr = {3, 5, 7};
		
		son.PapaSum(3, 5, 7);
		int result2 = son.PapaSum(3, 5, 7);
		System.out.println("자식 클래스 메서드 값: " + result2);

		int difference = Math.abs(result - result2);
		System.out.println("부모클래스와 자식클래스 값 차이: " + difference);
	}

}
