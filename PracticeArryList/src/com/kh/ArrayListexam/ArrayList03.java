package com.kh.ArrayListexam;

import java.util.Scanner;

public class ArrayList03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수 입력!");
		int num1 = sc.nextInt();
		System.out.println("두 번째 정수 입력!");
		int num2 = sc.nextInt();
		System.out.println("세 번째 정수 입력!");
		int num3 = sc.nextInt();
		System.out.println("네 번째 정수 입력!");
		int num4 = sc.nextInt();
		System.out.println("다섯 번째 정수 입력!");
		int num5 = sc.nextInt();
		
		int[] num = {num1, num2, num3, num4, num5};  // 5개의 입력한 정수 배열로 선정
		int sum = 0;       // 정수 합을 나타내낼 변수 선언
		
		for(int total : num) {
			sum += total;
		}
		System.out.println("5개 정수의 합 : " + sum);
		

	}

}
