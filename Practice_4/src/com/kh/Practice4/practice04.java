package com.kh.Practice4;

import java.util.Scanner;

public class practice04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isTrue = false;
		while(!isTrue) {
			System.out.println("정수 : ");
			int select = sc.nextInt();
			int[] num = new int[select];
			
			if(select >= 3) {
				if(select % 2 == 1) {
			for(int i = 1; i < num.length; i++) {
				System.out.print(i + ", ");
			}
			for(int i = num.length; i >= 1; i--) {
				System.out.print(i+ ", ");
			}
			isTrue = true;
		}else {
			System.out.println("다시 입력하세요!");
			isTrue = false; 
		}
		} 
		}

	}

}
