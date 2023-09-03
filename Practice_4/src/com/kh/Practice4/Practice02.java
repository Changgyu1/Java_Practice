package com.kh.Practice4;

import java.util.Scanner;

public class Practice02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0 ~ 6 사이 숫자 입력 : ");
		int count = sc.nextInt();
		String[] day = {"월","화","수","목","금","토","일"};
		
		switch(count) {
			case 0:	case 1: case 2: case 3: case 4: case 5: case 6:
				System.out.println(day[count]);
				break;
			default:
				System.out.println("잘못 입력 하셨습니다.");
		}
	}
}
