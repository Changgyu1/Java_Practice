package com.kh.Practice2.func;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float korean, math, english;
		
		System.out.println("���� ������ �Է����ּ��� : ");
		korean = sc.nextFloat();
		System.out.println("���� ������ �Է����ּ��� : ");
		math = sc.nextFloat();
		System.out.println("���� ������ �Է����ּ��� : ");
		english = sc.nextFloat();
		
		System.out.println("���� : " + korean);
		System.out.println("���� : " + math);
		System.out.println("���� : " + english);
		int korean1 = (int) korean;
		int math1 = (int) math;
		int english1 = (int) english;
		
		System.out.println("���� : " + (korean1 + math1 + english1));
		System.out.println("��� : " + (korean1 + math1 + english1)/3);
		

	}

}
