package com.company.study.ch05;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		
		
		// int[] b = new int[];
		int[] arr1 = new int[3];
		
		int[] arr2;
		arr2 = new int[5];
		
		arr1[0] = 77;
		arr1[1] = 88;
		arr1[2] = 99;
		System.out.println("arr1[0]: " + arr1[0]);
		System.out.println("arr1[1]: " + arr1[1]);
		System.out.println("arr1[2]: " + arr1[2]);
		
		arr2[4] = 00;
		System.out.println("arr2[4]: " + arr2[4]);
			
		

	}

}
