package com.company.study.ch06;

public class Arithmetic {
	
	String plus = "더하기";
	String minus = "빼기";
	
	//기본생성자
	Arithmetic() {
		
	}

	Arithmetic(String plus, String minus) {
		this.plus = plus;
		this.minus = minus;
	}
	
	
	public int plus(int a, int b) {
		int plus = 0;
		plus = a + b;
		return plus;
	}
	
	/*
	 public int plus(int a, int b) {
	 	return a + b;
 	 }
	 */
	
	public int minus(int a, int b) {
		int minus = 0;
		minus = a - b;
		return minus;
	}
	
	/*
	 public int minus(int a, int b) {
	 	return a - b;
	 }
	 */
	
	public int multiplication(int a, int b) {
		int multiplication = 0;
		multiplication = a*b;
		return multiplication;
	}
	
	/*
	 public int multiplication(int a, int b) {
	 	return a * b;
	 }
	 */
	
	public int division(int a, int b) {
		int division = 0;
		division = a/b;
		return division;
	}
	
	/*
	 public int division(int a, int b) {
	 	return a / b;
	 }
	 */
	
	public int remainder(int a, int b) {
		int remainder = 0;
		remainder = a%b;
		return remainder;
	}
	
	/*
	 public int remainder(int a, int b) {
	 	return a % b;
	 }
	 */

	public void chulruk(int a) {
		System.out.println("값은 " + a + "입니다.");
	}

	public String munja(String a, String b) {
		String connect = "";
		connect = a+b;
		return connect;
	}
	
	/*
	 public String munja(String a, String b) {
	 	return a + b;
	 }
	 */
	
	public void coupling(String a) {
		System.out.println("정답은 " + a + "입니다.");
	}
}
