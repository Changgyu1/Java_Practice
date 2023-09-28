package com.kh.ArrayListexam;

import java.util.Arrays;

public class ArrayList04 {
	
	public static void main(String[] args) {
		
		// 문자열 배열을 사용해서 
		//향샹된 for Loop로 문자열 배열의 요소 중 
		//가장 긴 문자열을 찾아 출력하기
		int[] array = {1,2,3,5,4,70,80,60,41,25,26};
		Arrays.sort(array);
        int answer = array[array.length/2];
        System.out.println(answer);
	}

}
