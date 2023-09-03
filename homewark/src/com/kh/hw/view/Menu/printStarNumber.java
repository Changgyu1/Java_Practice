package com.kh.hw.view.Menu;

import java.util.Scanner;

public class printStarNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요!");
		int number = sc.nextInt();
		
		
		if (number > 0) { 
			for (int i = 1; i <= number; i++) {
				for (int j = 1; j < i; j++) {
					System.out.print("*");
				}
				System.out.println(i);
			}
		} else {
			System.out.print("양수가 아닙니다.");
		}
	}

}
