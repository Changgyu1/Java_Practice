package com.kh.home.Practice1;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select;
		System.out.print("메뉴 번호를 입력하세요 : ");
		select = sc.nextInt();
		
		switch (select) {
		case 1:
			System.out.println("입력 메뉴입니다");
			break;
		case 2:
			System.out.println("수정 메뉴입니다");
			break;
		case 3:
			System.out.println("조회 메뉴입니다");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다");
			break;
		case 7:
			System.out.println("프로그램이 종료 됩니다.");
			break;
		default :
			System.out.println("잘못된 번호 입니다.");
		}


	}

}
