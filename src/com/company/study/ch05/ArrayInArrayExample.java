package com.company.study.ch05;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		
		int[][] scores = {{99,77,66}, {55,55,64}, {55,55,75}, {99,77,66}, {99,77,66}};
		
		//64
		System.out.println("scores[1][2]: " + scores[1][2]);
		//99
		System.out.println("scores[3][0]: " + scores[3][0]);
		//77
		System.out.println("scores[3][1]: " + scores[3][1]);
		//66
		System.out.println("scores[4][2]: " + scores[4][2]);
		
		
		// 국영수 점수(장원영 장동건 고소영 원빈 이나영)
		// 1. 개인의 평균
		double sum = 0;
		double avg = 0;
		String[] name = {"장원영", "장동건", "고소영", "원빈", "이나영"};
		String[] subject = {"국어", "영어", "수학"};
		
		/*
		for(int i=0; i<=4; i++) {
			for(int j=0; j<=2; j++) {
				sum += scores[i][j];
			}
			avg = sum/3;
			
			if(i==0) {
				System.out.println("장원영의 평균점수: " + avg);
			} else if(i==1) {
				System.out.println("장동건의 평균점수: " + avg);
			} else if(i==2) {
				System.out.println("고소영의 평균점수: " + avg);
			} else if(i==3) {
				System.out.println("원빈의 평균점수: " + avg);
			} else {
				System.out.println("이나영의 평균점수: " + avg);
			}
			sum = 0;
		}
		*/
		
		for(int i=0; i<scores.length; i++) {
			sum = 0;
			for(int j=0; j<scores[i].length; j++) {
				sum += scores[i][j];
			}
			avg = sum/3;
			System.out.println(name[i] + "의 평균점수: " + avg);
		}
		
		
		
		// 2. 과목별 평균
		/*
		  for(int i=0; i<=2; i++) { 
		  	for(int j=0; j<=4; j++) { 
		  		sum += scores[j][i]; 
	  		}
		  	avg = sum/5;
		  
		  	if(i==0) { 
		  		System.out.println("국어 평균점수: " + avg); 
		  		} else if(i==1) {
		  			System.out.println("영어 평균점수: " + avg); 
	  			} else {
		  			System.out.println("수학 평균점수: " + avg); 
	  			} 
	  			sum = 0; 
  			}
		 */
		
		for(int i=0; i<scores[i].length; i++) {
			sum = 0;
			for(int j=0; j<scores.length; j++) {
				sum += scores[j][i];
			}
			avg = sum/scores.length;
			System.out.println(subject[i] + "의 평균 점수: " + avg);
		}
		
		
		//국영수 점수를 바꾸기(양 끝 사람들)
		

	}

}
