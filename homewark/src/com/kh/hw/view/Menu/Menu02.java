package com.kh.hw.view.Menu;

import java.util.Scanner;

public class Menu02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.println("두 번째 정수 : ");
		int num2 = sc.nextInt();
		int sum = 0;
		int big = Math.max(num1, num2);    // num1 과 num2 중 큰 수 출력
		int small = Math.min(num1, num2);  // num1 과 num2 중 작은 수 출력

		for(int i = small; i <= big; i++) {
			sum += i;
		}
		System.out.println(small + "부터 " + big + "까지 " + "정수들의 합 : " +sum);
	}

}
