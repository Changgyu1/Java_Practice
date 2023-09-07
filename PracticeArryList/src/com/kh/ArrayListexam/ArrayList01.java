package com.kh.ArrayListexam;

import java.util.ArrayList;

public class ArrayList01 {

	public static void main(String[] args) {
/*
ArrayList 이용해서 빨주노초파남보
수정 3회 1,3,5 ->블랙, 브라운, 그린 수정
더하기 2회 ->주황, [옐로우],파랑,[연한파랑]
향상된 for문 이용해서 색상 출력하기
최 후 출력 빨 파 보
 */
		ArrayList<String> color = new ArrayList<>();
		
		//ArrayList 이용해서 빨주노초파남보
		color.add("빨강"); color.add("주황"); color.add("노랑"); color.add("초록"); color.add("파랑"); color.add("남색"); color.add("보랑");
		System.out.println("색깔 : " + color);
		
		//수정 3회 1,3,5 ->블랙, 브라운, 그린 수정
		color.set(1, "블랙"); color.set(3, "브라운"); color.set(5, "그린");
		System.out.println("색깔 수정 후 : " + color);
		
		//더하기 2회 ->주황, [옐로우],파랑,[연한파랑]
		color.add(2, "옐로우"); color.add(6, "연한파랑"); 
		System.out.println("색깔 더하기 후 : " + color);
		
		//향상된 for문 이용해서 색상 출력하기
		System.out.println("- 색상 출력 -");
		for(String col : color) {
			System.out.println(col);
		}
		
		//최 후 출력 빨 파 보
		color.remove(1); color.remove(1); color.remove(1); color.remove(1); color.remove(2); color.remove(2);
		System.out.println("최 후 출력 : " + color);
		
	}

}
