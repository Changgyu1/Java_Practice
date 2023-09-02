package com.kh.hw.view.Menu;

import java.util.Scanner;

public class Menu01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean isTrue = false;
		while (!isTrue) {
			System.out.println("메뉴 번호 : ");
			int number = sc.nextInt();
			switch (number) {
			case 1:
				System.out.println("1. 간단 계산기");
				isTrue = true;
				break;
			case 2:
				System.out.println("2. 작은 수에서 큰 수까지 합계");
				isTrue = true;
				break;
			case 3:
				System.out.println("3. 신상 정보 확인");
				isTrue = true;
				break;
			case 4:
				System.out.println("4. 학생 정보 확인");
				isTrue = true;
				break;
			case 5:
				System.out.println("5. 별과 숫자 출력");
				isTrue = true;
				break;
			case 6:
				System.out.println("6. 난수까지의 합계");
				isTrue = true;
				break;
			case 7:
				System.out.println("7. 구구단");
				isTrue = true;
				break;
			case 8:
				System.out.println("8. 주사위 숫자 알아맞추기 게임");
				isTrue = true;
				break;
			case 9:
				System.out.println("9. 프로그램 종료");
				isTrue = true;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		
	}

}
