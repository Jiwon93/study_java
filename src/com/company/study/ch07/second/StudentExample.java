package com.company.study.ch07.second;

public class StudentExample {

	public static void main(String[] args) {
		
		//명시적 생성자를 사용하여 객체를 생성하고
		//모든 필드를 출력하시오
		
		Student student = new Student("신지원", "001120-1234567");
		
		System.out.println(student.name);
		System.out.println(student.ssn);
		System.out.println(student.studentNo);
		
		Student student1 = new Student("장동건", "991031-1234567", 2);
		
		System.out.println(student1.name);
		System.out.println(student1.ssn);
		System.out.println(student1.studentNo);
	

	}

}
