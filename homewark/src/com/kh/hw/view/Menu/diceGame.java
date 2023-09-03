package com.kh.hw.view.Menu;

import java.util.Scanner;

public class diceGame {
// 미완
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isTrue = false;
		boolean isTrueEx = false;
		
		while(!isTrue) {
			int rna1 = (int) (Math.random() * 6);
			int rna2 = (int) (Math.random() * 6);
			int rnaEx = rna1 + rna2;
			System.out.println("숫자를 입력해주세요!");
			int num = sc.nextInt();
			
			if (num == rnaEx) {
				System.out.println("정답입니다.!");
				System.out.println("주사위 합 : " + rnaEx);
				System.out.println("다시 진행하시겠습니까? / (Y/N)");
				char reTurn = sc.next().charAt(0);
				switch(reTurn) {
					case 'Y': case 'y':
						isTrue = false;
						break;
					case 'N': case 'n':
						isTrue = true;
						break;
					default:
						System.out.print("Y / N  중 하나만 입력해주세요(소문자가능");
						continue;
				}
			} else if (num != rnaEx) {
				System.out.println("틀리셨습니다. 다시 입력해주세요!");
				while(!isTrueEx) {
					System.out.println("숫자를 입력해주세요!");
					isTrueEx = true;
					break;
				}
			}
		}
	}
}