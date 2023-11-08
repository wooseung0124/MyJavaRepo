package test.main;

import java.util.Scanner;

import test.mypac.MyUtil;
import test.mypac.WordFilterException;

public class MainClass06 {
	public static void main(String[] args) {
		// 문자열 입력 받을 객체
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("전송할 문자열 입력: ");
			String inputMsg=scan.nextLine();
			
			// MyUtil에서 예외발생시 멈추지 않도록 만듬
			try {
				//MyUtil 클래스의 static 메소드를 이용해서 전송하기
				MyUtil.sendMessage(inputMsg);
			}catch(WordFilterException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
