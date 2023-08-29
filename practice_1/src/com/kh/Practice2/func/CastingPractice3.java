package com.kh.Practice2.func;

public class CastingPractice3 {

	public static void main(String[] args) {
		
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1 - (iNum2)*2); // 2
		int dNum1 = (int) dNum;
		System.out.println(dNum1); // 2
		
		
		System.out.println((float) 2*(iNum2) + dNum1 ); // 10.0
		System.out.println((float) iNum1);  //�׳� �غý��ϴ�.
		float iNum12 = (float) iNum1;
		System.out.println(iNum12); // 10.0
		
		System.out.println(iNum12 / ((float)iNum2)); // 2.5
		System.out.println(dNum); // 2.5
		int fNum1 = (int) fNum;
		System.out.println(fNum1); // 3
		
		System.out.println("����"); // 3
		
		System.out.println(iNum1 / fNum); // 3.333333
		double fNumDouble = (double) fNum;
		System.out.println(iNum1 / fNumDouble); // 3.3333333333333335
		
		System.out.println(ch); // 'A'
		System.out.println((int)ch); // 65
		System.out.println(iNum1 + (int)ch); // 75
		System.out.println((char) ((int)ch + iNum1)); // 'K' 75 
		//
	}

}
