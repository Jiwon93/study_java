package com.company.study.ch07;

import java.util.Arrays;

public class Papa {
	
	int sum ;
// int[] arr = new int[3];
	
	/*
	 public void SortByAsc(int arr[]) {
	 	for(int i=0; i<arr.length; i++) {
	 		for(int j=0; j<arr.length-1; j++) {
	 			if(arr[i]<arr[j]) {
	 				int tmp = arr[i];
	 				arr[i] = arr[j];
	 				arr[j] = tmp;
 				}
			}
		}
	}
	
	public int getSum(int arr[]) {
		sum = arr[0] * arr[1] + arr[2];
		return sum;
	 */
	
	
	public void PapaArray(int a, int b, int c) {
		int[] array = new int[3];
		array[0] = a;
		array[1] = b;
		array[2] = c;
		Arrays.sort(array);
		
		for(int i=0; i<array.length; i++) {
			System.out.println((i+1) + "번째 정수: " + array[i]);
		}
	}
	
	public int PapaSum(int a, int b, int c) {
		int[] array = new int[3];
		array[0] = a;
		array[1] = b;
		array[2] = c;
		Arrays.sort(array);
		
		sum = array[0]*array[1]+array[2];
		return sum;
	}
	
}
