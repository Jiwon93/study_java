package com.company.study.ch06;

public class BoardExample {

	public static void main(String[] args) {
		
		Board board = new Board();
		
		// 초기값
		System.out.println(board.name);
		System.out.println(board.views);
		System.out.println(board.useOrNot);
		
		Board board1 = new Board("장동건");
		Board board2 = new Board("고소영", 3000);
		Board board3 = new Board("원빈", true);
		Board board4 = new Board("이나영", 1000, false);
		
		// 생성자1 필드
		System.out.println(board1.name);
		
		// 생성자2 필드
		System.out.println(board2.name);
		System.out.println(board2.views);
		
		// 생성자3 필드
		System.out.println(board3.name);
		System.out.println(board3.useOrNot);
		
		// 생성자4 필드
		System.out.println(board4.name);
		System.out.println(board4.views);
		System.out.println(board4.useOrNot);
	}

}
