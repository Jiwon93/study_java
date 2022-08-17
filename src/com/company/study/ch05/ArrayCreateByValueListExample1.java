package com.company.study.ch05;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		
		// 배열 선언 방법
		int[] scoreEnglish;
		int scoreMath[];
		
		int[] scoreChemistry = {88,99,45,86,34};
		
		String[] name = {"장동건","고소영","원빈"};
		
		System.out.println("장동건 화학성적 : " + scoreChemistry[0]);
		System.out.println("누굴까 : " + name[2]);
		
		
		// scoreChemistry의 평균을 구해서 출력하시오
		
		double sum = 0;
		
		for(int i=0; i<=scoreChemistry.length-1; i++) {
			sum += scoreChemistry[i];
		}
		
		double avg = sum/scoreChemistry.length;
		
		System.out.println("화학 평균값 : " + avg);
		
		/*
		double sum = 0;
		
		for(int i=0; i<=4; i++) {
			sum += scoreChemistry[i];
		}
		
		double avg = sum/5;
		
		System.out.println("화학 평균값 : " + avg);
		*/
		

	}

}
