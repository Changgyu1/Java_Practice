package com.kh.hw.view.Menu;

import java.util.Scanner;

public class printProfile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean isTrue = false;
		

		
		while (!isTrue) { 
			System.out.println("이름 : ");
			String name = sc.next();

			System.out.println("나이 : ");
			int age = sc.nextInt();

			System.out.println("성별을 입력해주세요 ex) 남자/남, /여자/여");
			System.out.println("성별 : ");
			String gender = sc.next();

			System.out.println("성격 : ");
			String personality = sc.next();
			switch (gender) {
			case "남자":
			case "남":
				System.out.println("이름 : " + name);
				System.out.println("나이 : " + age);
				System.out.println("성별 : " + gender);
				System.out.println("성격 : " + personality);
				isTrue = true;
				break;
			case "여자":
			case "여":
				System.out.println("이름 : " + name);
				System.out.println("나이 : " + age);
				System.out.println("성별 : " + gender);
				System.out.println("성격 : " + personality);
				isTrue = true;
				break;
			default:
				System.out.println("올바르지 않은 성별입니다. 다시 입력해주세요!");
				isTrue = false;
			}

		}
	}

}
