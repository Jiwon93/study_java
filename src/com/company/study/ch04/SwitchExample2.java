package com.company.study.ch04;

public class SwitchExample2 {

	public static void main(String[] args) {
		// 
		
		String grade[] = {"일반", "브론즈", "실버", "골드", "플래티넘"}; // 일반, 브론즈, 실버, 골드, 플래티넘
		int cost = 10000;
		
		switch(grade[1]) {
		case "일반":
			double sale1 = cost*(1-0.05);
			System.out.println("일반: " + (int)sale1 + "원(할인가)" + " | " + cost + "원(정가)");
			break;
		case "브론즈":
			double sale2 = cost*(1-0.10);
			System.out.println("브론즈: " + (int)sale2 + "원(할인가)" + " | " + cost + "원(정가)");
			break;
		case "실버":
			double sale3 = cost*(1-0.15);
			System.out.println("실버: " + (int)sale3 + "원(할인가)" + " | " + cost + "원(정가)");
			break;
		case "골드":
			double sale4 = cost*(1-0.20);
			System.out.println("골드: " + (int)sale4 + "원(할인가)" + " | " + cost + "원(정가)");
			break;
		case "플래티넘":
			double sale5 = cost*(1-0.027);
			System.out.println("플래티넘: " + (int)sale5 + "원(할인가)" + " | " + cost + "원(정가)");
			break;
		default:
			System.out.println("회원이 아니라서 정가로만 구매 가능합니다.");
			break;
		}

	}

}
