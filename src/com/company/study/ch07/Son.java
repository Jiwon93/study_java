package com.company.study.ch07;

public class Son extends Papa {
	
	
	//@Override
	/*
	 public int getSum(int arr[]) {
	  sum = arr[0] * arr[1] + arr[2] + 10;
	  
	  return sum;
	 */
	
	int sum;
	
	public Son() {
	}

	@Override
	public int PapaSum(int a, int b, int c) {
		
		return super.PapaSum(a, b, c) + 10;
	}
	
}
