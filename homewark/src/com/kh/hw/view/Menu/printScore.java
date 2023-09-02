package com.kh.hw.view.Menu;

import java.util.Scanner;

public class printScore {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean isTrue = false;
		char sexualEx = 0;

		while (!isTrue) {
			System.out.println("이름 : ");
			String name = sc.next();

			System.out.println("학년 : ");
			int grade = sc.nextInt();

			System.out.println("반 : ");
			int half = sc.nextInt();

			System.out.println("번 : ");
			int number = sc.nextInt();

			System.out.println("성별M/F : ");
			char gender = sc.next().charAt(0);
			String genderEx = null;
			
			System.out.println("성적 : ");
			double sexual = sc.nextDouble();
			
			if (sexual >= 90) {
				sexualEx = 'A';
			} else if (sexual >= 80) {
				sexualEx = 'B';
			} else if (sexual >= 70) {
				sexualEx = 'C';
			} else if (sexual >= 60) {
				sexualEx = 'D';
			} else if (sexual < 60) {
				sexualEx = 'F';
			} else if (sexual < 100) {
				sexualEx = 'S';
			}
			
			if (gender == 'M') {
				genderEx = "남학생";
			} else if (gender == 'F') {
				genderEx = "여학생";
			} else {
				genderEx = "(외계인??)";
				System.out.println("성별은 (M / F) 로 입력해주세요!");
			}
			
			System.out.println(grade + "학년 " + half + "반 " + number + "번 " + genderEx + " " + name + "의 점수는 " + sexual + "이고 " + 
			sexualEx + "학점입니다.");
			isTrue = true;
		}

	}

}
