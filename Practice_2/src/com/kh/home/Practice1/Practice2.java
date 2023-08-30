package com.kh.home.Practice1;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int number = sc.nextInt();
		
		if (number < 0) {
			System.out.println("양수만 입력해주세요!");
		}else if (number % 2 == 1) {
			System.out.println("홀수다!");
		}else if (number %2 == 0) {
			System.out.println("짝수다!");
		}
		
		

	}

}
