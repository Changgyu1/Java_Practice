package com.kh.Practice2.func;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float korean, math, english;
		
		System.out.println("국어 점수를 입력해주세요 : ");
		korean = sc.nextFloat();
		System.out.println("수학 점수를 입력해주세요 : ");
		math = sc.nextFloat();
		System.out.println("영어 점수를 입력해주세요 : ");
		english = sc.nextFloat();
		
		System.out.println("국어 : " + korean);
		System.out.println("수학 : " + math);
		System.out.println("영어 : " + english);
		int korean1 = (int) korean;
		int math1 = (int) math;
		int english1 = (int) english;
		
		System.out.println("총점 : " + (korean1 + math1 + english1));
		System.out.println("평균 : " + (korean1 + math1 + english1)/3);
		

	}

}
