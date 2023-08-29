package com.kh.Practice1.func;

import java.io.InputStream;
import java.util.Scanner;

public class VariablePractice3 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		double width, length;
		
		System.out.println("가로를 입력해주세요 : ");
		width = sca.nextDouble();
		System.out.println("세로를 입력해주세요 : ");
		length = sca.nextDouble();
		
		System.out.println("가로 : " + width);
		System.out.println("세로 : " + length);
		System.out.println("멵적: " + (width * length));
		System.out.println("둘레 : " + (width + length)*2);

	}
}
