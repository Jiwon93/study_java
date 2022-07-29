package com.company.study.ch02;

public class LongExample {

	public static void main(String[] args) {
		
		long var1 = 10;
		long var2 = 2012345567; 
		long var3 = 20123455678L; // int의 범위를 초과하면 끝에 L을 붙여줘야 함. 
		
		//long var3 = 1000000000000; 에러, 범위 초과
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);

	}

}
