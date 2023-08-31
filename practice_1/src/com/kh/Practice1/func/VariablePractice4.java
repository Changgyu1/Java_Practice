package com.kh.Practice1.func;

import java.util.Scanner;

public class VariablePractice4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요 : ");
		String s = sc.next();
		
		char indexNum1 = s.charAt(0);  // 문자를 1자씩 읽음  // charAt(0)   << 몇번 자리를 읽을지 출력
		char indexNum2 = s.charAt(1);
		char indexNum3 = s.charAt(2);
		//    apple
		//    012345
		System.out.println("index 1번째 단어 : " + indexNum1);
		System.out.println("index 2번째 단어 : " + indexNum2);
		System.out.println("index 3번째 단어 : " + indexNum3);


	}

}
