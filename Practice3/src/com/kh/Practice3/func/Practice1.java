package com.kh.Practice3.func;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("한개의 숫자를 입력하세요");
		int num = sc.nextInt();
		
		for(int i = 0; i <= num; i++) {
			System.out.println(i);
		} if (num < 1) {
			System.out.println("1이상의 숫자를 입력해주세요!");
		}
	}
}
