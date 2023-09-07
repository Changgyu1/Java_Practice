package com.kh.ArrayListexam;

public class ArrayList02 {
	
	public static void main(String[] args) {

		int[] numbers = {1,2,3,4,5}; 
		//향상된 for문을 이용해서 숫자 출력하기 (String 이용 금지)
		System.out.println("- 숫자 출력 -");
		for(int num : numbers) {
			System.out.println(num);
		}
		
	}

}
