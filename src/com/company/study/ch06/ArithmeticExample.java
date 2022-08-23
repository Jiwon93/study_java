package com.company.study.ch06;

public class ArithmeticExample {

	public static void main(String[] args) {
		
		Arithmetic arithmet = new Arithmetic();
		
		int resultPlus = arithmet.plus(5, 7);
		int resultMinus = arithmet.minus(10, 3);
		int resultMultiple = arithmet.multiplication(9, 6);
		int resultDivision = arithmet.division(250, 50);
		int resultRemainder = arithmet.remainder(17, 4);
		
		arithmet.chulruk(resultPlus);
		arithmet.chulruk(resultMinus);
		arithmet.chulruk(resultMultiple);
		arithmet.chulruk(resultDivision);
		arithmet.chulruk(resultRemainder);
		
		String resultConnect = arithmet.munja("안녕", "하세요");
		
		arithmet.coupling(resultConnect);
		
	}

}
