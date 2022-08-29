package com.company.study.ch07.sixth;

public class Cat extends Animal {
	
	//생성자
	public Cat() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("야옹");
	}
	
	
	@Override
	public void sound(String m) {
		System.out.println("야옹" + m);
	}
	

}
