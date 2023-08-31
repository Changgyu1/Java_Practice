package com.kh.review.func;

import java.util.Scanner;

public class review5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("하나의 숫자를 입력해주세요!");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i <= num; i++) {
			sum += i;
		}
		System.out.println("총 합 : " + sum);

	}

}
