package com.kh.cc;

import java.util.Scanner;

public class smaplec {

	public static void main(String[] args) {
		int black = 1;
		String blank = "□";
		String KingB = "♠";
		String KingW = "♤";
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		String[][] che = { { blank, blank, blank, blank, KingW, blank, blank, blank },
				{ blank, blank, blank, blank, blank, blank, blank, blank },
				{ blank, blank, blank, blank, blank, blank, blank, blank },
				{ blank, blank, blank, blank, blank, blank, blank, blank },
				{ blank, blank, blank, blank, blank, blank, blank, blank },
				{ blank, blank, blank, blank, blank, blank, blank, blank },
				{ blank, blank, blank, blank, blank, blank, blank, blank },
				{ blank, blank, blank, KingB, blank, blank, blank, blank } };
		
		
		for (int i = 0; i < che.length; i++) {
			for (int a = 0; a < che[i].length; a++) {

				System.out.print(che[i][a] + " ");
			}
			System.out.println();
		}
		
	}

}
