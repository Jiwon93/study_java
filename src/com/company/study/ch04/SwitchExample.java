package com.company.study.ch04;

public class SwitchExample {

	public static void main(String[] args) {
		
		int num = 7;
		
		switch(num) {
			case 1:
				System.out.println("1번이 나왔습니다.");
				break;
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			default:
				System.out.println("1도 2도 아닌 정수 입니다.");
				break;
		}
		
		String position = "사원";
		
		switch (position) {
		case "사원":
			System.out.println("연봉은 5,000 입니다.");
			break;
		case "대리":
			System.out.println("연봉은 6,000 입니다.");
			break;
		case "과장":
			System.out.println("연봉은 7,000 입니다.");
			break;
		case "부장":
			System.out.println("연봉은 9,000 입니다.");
			break;
		case "사장":
			System.out.println("연봉은 20,000 입니다.");
			break;
		default:
			System.out.println("본사의 직원이 아닙니다. 다시 입력해 주세요.");
			break;
		}

	}

}
