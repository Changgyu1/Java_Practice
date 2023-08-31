package com.kh.review.func;

import java.util.Scanner;

public class review1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("한 개의 숫자를 입력해주세요!");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			System.out.println(i);
		}
		
	}

}
