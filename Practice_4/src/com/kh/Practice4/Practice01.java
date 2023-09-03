package com.kh.Practice4;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num;

		System.out.println("숫자를 입력해주세요!");
		int count = sc.nextInt();
		num = new int[count];

		if (count > 0) {
			for (int i = 1; i <= num.length; i++) {
				System.out.println(i);
			}
		} else {
			System.out.println("1이상의 숫자만 입력해주세요!");
		}
	}

}
