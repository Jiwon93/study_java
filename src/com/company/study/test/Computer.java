package com.company.study.test;

public class Computer extends Calculator {

	@Override
	public double circleArea(int param) {
		return param*param*constants.PAI_2;
	}
	
}
