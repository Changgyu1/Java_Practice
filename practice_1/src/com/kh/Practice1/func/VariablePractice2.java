package com.kh.Practice1.func;

import java.util.Scanner;

public class VariablePractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int first, second;
		
		System.out.println("첫번째 정수를 입력해주세요 : ");
		first = sc.nextInt();
		System.out.println("두번째 정수를 입력해주세요 : ");
		second = sc.nextInt();
		
		System.out.println("첫 번째 정수 : " + first);
		System.out.println("두 번째 정수 : " + second);
		System.out.println(first + " + " + second + " = " + (first + second));
		System.out.println(first + " - " + second + " = " + (first - second));
		System.out.println(first + " * " + second + " = " + (first * second));
		System.out.println(first + " / " + second + " = " + (first / second));
		
		

	}

}
