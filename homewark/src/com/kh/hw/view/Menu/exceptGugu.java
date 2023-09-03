package com.kh.hw.view.Menu;

import java.util.Scanner;

public class exceptGugu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요 : ");
		int number = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= number; i++) {
			if (i * number == number * i) {
				sum += number;
				System.out.println(number + " * " + i + " = " + sum);
				
			}
		}
	}

}
