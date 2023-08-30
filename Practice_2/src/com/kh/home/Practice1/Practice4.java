package com.kh.home.Practice1;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		System.out.print("몇 월인지 입력해 주세요 : ");
		
		number = sc.nextInt();
		

		switch(number) {
			case 1: case 2: case 12:
				System.out.println(number + "월은 겨울입니다.");
				break;
			case 3: case 4: case 5:
				System.out.println(number + "월은 봄입니다.");
				break;
			case 6: case 7: case 8:
				System.out.println(number + "월은 여름입니다.");
				break;
			case 9: case 10: case 11:
				System.out.println(number + "월은 가을입니다.");
				break;
			default :
				System.out.println(number + "월은 잘못 입력된 달입니다.");
		
		}

	}

}
