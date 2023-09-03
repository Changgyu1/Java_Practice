package com.kh.Practice4;

import java.util.Scanner;

public class practice05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] chicken = {"양념","간장","마늘","허니콤보"};
		System.out.println("치킨 이름을 입력하세요!");
		String food = sc.next();
		
		switch(food) {
			case "양념":case "간장":case "마늘":case "허니콤보":
				System.out.println(food +"치킨 배달 가능");
				break;
			default:
				System.out.println(food + "치킨은 없는 메뉴입니다.");
				
		}

	}

}
