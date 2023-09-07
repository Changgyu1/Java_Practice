package com.kh.ArrayListexam;

public class ArrayList04 {
	
	public static void main(String[] args) {
		
		// 문자열 배열을 사용해서 
		//향샹된 for Loop로 문자열 배열의 요소 중 
		//가장 긴 문자열을 찾아 출력하기
		
		String[] ss = {"apple", "banana", "elderBerry", "cheery"};
		String longss = "";
		
		for(String lons : ss) {
			if(lons.length() > longss.length()) {
				longss = lons;
			}
		}
		System.out.println("가장 긴 문자열 : " + longss);
	}

}
