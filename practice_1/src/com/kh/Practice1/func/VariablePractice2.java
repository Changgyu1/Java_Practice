package com.kh.Practice1.func;

import java.util.Scanner;

public class VariablePractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int first, second;
		
		System.out.println("ù��° ������ �Է����ּ��� : ");
		first = sc.nextInt();
		System.out.println("�ι�° ������ �Է����ּ��� : ");
		second = sc.nextInt();
		
		System.out.println("ù ��° ���� : " + first);
		System.out.println("�� ��° ���� : " + second);
		System.out.println(first + " + " + second + " = " + (first + second));
		System.out.println(first + " - " + second + " = " + (first - second));
		System.out.println(first + " * " + second + " = " + (first * second));
		System.out.println(first + " / " + second + " = " + (first / second));
		
		

	}

}
