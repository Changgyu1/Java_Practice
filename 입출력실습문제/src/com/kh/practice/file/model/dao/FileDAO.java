package com.kh.practice.file.model.dao;
/*
checkName(file:String):boolean
+ fileSave(file:String, s:String):void
+ fileOpen(file:String):StringBuilder
+ fileEdit(file:String, s:String):void 

*/
public class FileDAO {
	String file;
	String s;
	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public boolean checkName(String file) {
		return true;
	}

	public void fileSave(String file, String s) {
		// 매개변수로 받은 파일 명에 문자열 저장
	}
	
	public StringBuilder fileOpen(String file) {
		//매개변수로 받은 파일 명을 이용하여 저장 되어 있는 데이터 반환
		return null;	
	}
	
	public void fileEdit(String file, String s) {
		//매개변수로 받은 파일 명에 문자열 저장
	}
}
