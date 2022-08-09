package com.company.study.ch04;

public class IfExample5 {

	public static void main(String[] args) {
		// int 타입의 변수를 2개 선언하고
		// 두 정수가 주어졌을때 사분면 어디에 해당되는지 출력하는 프로그램을 작성하시오.

		quadrant(10,100);
		quadrant(-10,100);
		quadrant(-10,-100);
		quadrant(10,-100);
		quadrant(0,1);
		quadrant(1,0);
		quadrant(0,0);
		
	}

	public static void quadrant(int x, int y) {
		
		if(x>0 & y>0) {
			System.out.println("1사분면");
		} else if(x<0 & y>0) {
			System.out.println("2사분면");
		} else if(x<0 & y<0) {
			System.out.println("3사분면");
		} else if(x>0 & y<0) {
			System.out.println("4사분면");
		} else if(x==0 & y!=0) {
			System.out.println("x축위");
		} else if(x!=0 & y==0) {
			System.out.println("y축위");
		} else { // x==0 & y==0
			System.out.println("x=0, y=0");
		}
	}
}
