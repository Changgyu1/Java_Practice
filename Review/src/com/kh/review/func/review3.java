package com.kh.review.func;

import java.util.Scanner;

public class review3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("한 개의 숫자를 입력해주세요!");
		int num = sc.nextInt();
		
		for(int i = num; i >= 1; i--) {
			System.out.println(i);
			} if (num <= 0) {
				System.out.println("1이상의 숫자를 입력해주세요!");
		} 

	}

}
