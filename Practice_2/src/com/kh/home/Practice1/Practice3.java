package com.kh.home.Practice1;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int korean, math, english;
		
		System.out.print("국어점수 : ");
		korean = sc.nextInt();
		
		System.out.print("수학점수 : ");
		math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		english = sc.nextInt();
		
		int Sum = (korean + math + english);
		int average = (Sum/3);
		float Faverage = (float) average;
		if (Faverage >= 60) {
			System.out.println("국어 : " + korean);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + english);
			System.out.println("합계 : " + Sum);
			System.out.println("평균 : " + Faverage);
			System.out.println("축하합니다, 합격입니다.");
		} else {
			System.out.println("국어 : " + korean);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + english);
			System.out.println("합계 : " + Sum);
			System.out.println("평균 : " + Faverage);
			System.out.println("아쉽게도 불합격입니다.");
		}


	}

}
