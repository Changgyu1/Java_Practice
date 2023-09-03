package com.kh.Practice4;

import java.util.Scanner;

public class practice03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 배열생성// 배열의 길이 설정
		System.out.println("정수를 입력해주세요!");
		int count = sc.nextInt();
		int[] numbers = new int[count];
		int sum = 0;

		for (int i = 0; i <= count; i++) {

			// 숫자형 입력
			System.out.println(i + "번째 " +"숫자를 입력하세요");
			numbers[i] = sc.nextInt();
		}

		for (int i = 0; i <= count; i++) {
			sum += numbers[i];
			System.out.println(i + " 숫자:" + numbers[i]);
			System.out.println("총 합 : " + sum);
		} 
	}  
}
