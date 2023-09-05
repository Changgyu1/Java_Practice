package com.kh.example.practice5.model.vo;

public class Lotto {
	private int[] lotto = new int[6];
	
	public Lotto() {
		
		for(int i = 0; i < 6; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
				
			}
		}
	}
	public void information() {
		System.out.println("로또 번호");
		for(int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + ", ");
		}
	}

	public int[] getLotto() {
		return lotto;
	}

	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}
}
