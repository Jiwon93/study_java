package com.company.study.ch06;

public class Television {

	
	// static 하면 객체 생성 없이 사용 가능
	public static String company = "Samsung";
	public static String model = "OLED";
	public static String info;
	
	public String version = "1.0";
	
	static {
		info = company + " " + model;
	}
	
}
