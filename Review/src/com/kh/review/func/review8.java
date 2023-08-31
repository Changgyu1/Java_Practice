package com.kh.review.func;

import java.util.Scanner;

public class review8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 하나 입력해주세요!");
		int num = sc.nextInt();
		int total = 0;
		
		for(int i = 1; i <= 9; i++) {
			total += num;
			System.out.println(num + " * " + i + " = " + total);
		}

	}

}
