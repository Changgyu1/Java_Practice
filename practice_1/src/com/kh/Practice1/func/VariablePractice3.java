package com.kh.Practice1.func;

import java.io.InputStream;
import java.util.Scanner;

public class VariablePractice3 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		double width, length;
		
		System.out.println("������ ���� �����ּ��� : ");
		width = sca.nextDouble();
		System.out.println("������ ���� �����ּ��� : ");
		length = sca.nextDouble();
		
		System.out.println("������ ���� : " + width);
		System.out.println("������ ���� : " + length);
		System.out.println("���� : " + (width * length));
		System.out.println("�ѷ� : " + (width + length)*2);

	}
}
