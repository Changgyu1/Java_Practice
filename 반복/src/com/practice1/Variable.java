package com.practice1;

import java.util.Scanner;

public class Variable {

	public static void main(String[] args) {
		Variable run = new Variable();
		//run.VariablePractice1();
		//run.VariablePractice2();
		//run.VariablePractice3();
		//run.VariablePractice4();
	}

	public void VariablePractice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요!");
		String name = sc.next();
		System.out.println("성별을 입력하세요!");
		char grade = sc.next().charAt(0);
		System.out.println("나이를 입력하세요!");
		int age = sc.nextInt();
		System.out.println("키를 입력하세요!");
		double height = sc.nextDouble();
		
		System.out.println("키 " + height + "인 " + age + "살 " + grade + "자 " + name + "님 반갑습니다." );
	}
	
	public void VariablePractice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수를 입력해주세요!");
		int num1 = sc.nextInt();
		System.out.println("두 번째 정수를 입력해주세요!");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼 기 결과 : " + (num1 - num2));
		System.out.println("나누기 결과 : " + (num1 / num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		
		
	}
	
	
}
