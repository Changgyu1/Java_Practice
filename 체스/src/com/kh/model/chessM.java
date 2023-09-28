package com.kh.model;

public class chessM {
	public int getBlack() {
		return black;
	}
	public void setBlack(int black) {
		this.black = black;
	}
	public String getBlank() {
		return blank;
	}
	public void setBlank(String blank) {
		this.blank = blank;
	}
	public String getKingB() {
		return KingB;
	}
	public void setKingB(String kingB) {
		KingB = kingB;
	}
	public String getKingW() {
		return KingW;
	}
	public void setKingW(String kingW) {
		KingW = kingW;
	}
	public String getBpon() {
		return Bpon;
	}
	public void setBpon(String bpon) {
		Bpon = bpon;
	}
	public String getWpon() {
		return Wpon;
	}
	public void setWpon(String wpon) {
		Wpon = wpon;
	}
	public String[][] getChe() {
		return che;
	}
	public void setChe(String[][] che) {
		this.che = che;
	}
	int black = 1;
	String blank = "□";
	String KingB = "♠";
	String KingW = "♤";
	String Bpon = "▲";
	String Wpon = "▽";
	String[][] che = { { blank, blank, blank, KingW, blank, blank, blank, blank },
			{ Wpon, Wpon, Wpon, Wpon, Wpon, Wpon, Wpon, Wpon },
			{ blank, blank, blank, blank, blank, blank, blank, blank },
			{ blank, blank, blank, blank, blank, blank, blank, blank },
			{ blank, blank, blank, blank, blank, blank, blank, blank },
			{ blank, blank, blank, blank, blank, blank, blank, blank },
			{ Bpon, Bpon, Bpon, Bpon, Bpon, Bpon, Bpon, Bpon },
			{ blank, blank, blank, KingB, blank, blank, blank, blank } };
	
	public chessM() {

	}
	
}
