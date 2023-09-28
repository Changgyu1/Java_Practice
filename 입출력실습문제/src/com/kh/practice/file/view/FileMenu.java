package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

/*
sc : Scanner = new Scanner(System.in)
- fc:FileController = new FileController()
+ mainMenu():void
+ fileSave():void
+ fileOpen():void
+ fileEdit():void

*/
public class FileMenu {
	private int pick;
	private boolean isTrue = false;
	Scanner sc = new Scanner(System.in);
	public boolean isTrue() {
		return isTrue;
	}

	public void setTrue(boolean isTrue) {
		this.isTrue = isTrue;
	}

	public int getPick() {
		return pick;
	}

	public void setPick(int pick) {
		this.pick = pick;
	}

	public FileController getFc() {
		return fc;
	}

	public void setFc(FileController fc) {
		this.fc = fc;
	}

	private FileController fc = new FileController();
	
	public void mainMenu(int pick) {
		//메인 메뉴 출력
		
		
		while (!isTrue) {
			System.out.println("***** My Note ********* My Note *****\r\n");
			System.out.println("1. 노트 새로 만들기");
			System.out.println();
			System.out.println("2. 노트 열기");
			System.out.println();
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println();
			System.out.println("9. 끝내기");
			System.out.println();
			System.out.print("메뉴 번호 : ");
			pick = sc.nextInt();

			switch (pick) {
			case 1:
				fc.fileSave(null, null);
				isTrue = true;
				break;
			case 2:
				fc.fileOpen(null);
				isTrue = true;
				break;
			case 3:
				fc.fileEdit(null, null);
				isTrue = true;
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				isTrue = true;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요!");
				isTrue = false;
			}
		}
		
	}
	
	public void fileSave(String s) {
		//파일 명과 저장할 값을 받음
		while(!isTrue) {
			System.out.println("파일에 저장할 내용을 입력하세요");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.println("내용 : ");
			s = sc.nextLine();
			fc.fileSave(s, null);
			switch(s) {
				case "ex끝it":
					
			}
		}
		
	}
	
	public void fileOpen() {
		//파일 명을 받아 저장된 데이터 출력
	}
	
	public void fileEdit() {
		//파일 명과 저장할 값을 받음
	}
}
