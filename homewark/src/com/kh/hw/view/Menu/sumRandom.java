package com.kh.hw.view.Menu;

import java.util.Random;

public class sumRandom {

	public static void main(String[] args) {
		
		int ran = (int)(Math.random()*100) +1 ;
		int sum = 0;
		for(int i = 1; i <= ran; i++) {
			sum += i;
		}
		System.out.println("r : " + sum);
	}

}