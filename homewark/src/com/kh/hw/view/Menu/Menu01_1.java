package com.kh.hw.view.Menu;

import java.util.Scanner;

public class Menu01_1 {

	public static void main(String[] args) {
	Scanner sc1 = new Scanner(System.in);
	
		System.out.println("첫번째 숫자를 입력해주세요!");
		int num1 = sc1.nextInt();
		System.out.println("두번째 숫자를 입력해주세요!");
		int num2 = sc1.nextInt();
		System.out.println("+ , - , * , / 중 하나를 입력해주세요!");
		char oper = sc1.next().charAt(0);
		int sum;
		switch(oper) {
			case '+':
				sum = num1 + num2;
				System.out.println(num1 + " + " + num2 + " = " + sum);
				break;
			case '-':
				sum = num1 - num2;
				System.out.println(num1 + " - " + num2 + " = " + sum);
				break;
			case '*':
				sum = num1 * num2;
				System.out.println(num1 + " * " + num2 + " = " + sum);
				break;
			case '/':
				if (num2 > 0) {
				sum = num1 / num2;
				System.out.println(num1 + " / " + num2 + " = " + sum);
				} else {
					System.out.println("0으로는 나눌 수 없습니다.");
					System.out.println(num1 + " / " + num2 + " = " + "0");
				}
				break;
			case '%':
				if (num2 > 0) {
				sum = num1 % num2;
				System.out.println(num1 + " % " + num2 + " = " + sum);
				} else {
					System.out.println("0으로는 나머지를 구할수 없습니다.");
					System.out.println(num1 + " / " + num2 + " = " + "0");
				}
				break;
			default:
				System.out.println("잘못된 연산자 입니다.");
				System.out.println("(+) (-) (*) (/) (%) 만 적어주세요!");
		}
		
		
		
		/*
		if(oper == '+') {
			int sum = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + sum);
			isTrue1 = true;
		} else if (oper == '-') {
			int sum = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + sum);
			isTrue1 = true;
		} else if (oper == '*') {
			int sum = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + sum);
			isTrue1 = true;
		} else if (oper == '/') {
				int sum = num1 / num2;
				System.out.println(num1 + " / " + num2 + " = " + sum);
				isTrue1 = true;
			} else if (num2 == 0) {
				System.out.println("0으로는 나눌 수 없습니다.");
				System.out.println(num1 + " / " + num2 + " = " + "0");
				isTrue1 = true;
			} else {
				System.out.println("+ , - , * , / 중 하나를 입력해주세요!");
				isTrue1 = false;
			}*/
		
	
	}

}
