package com.kh.Practice4;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민등록번호(-포함) : ");
		char[] carr = sc.nextLine().toCharArray();
		
		String sum = "";
		for (int i = 0; i < carr.length; i++) {
			if (i > 7) {
				carr[i] = '*';
			}
			System.out.println(carr[i]);
		}
	}

}
