package test.main;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		// 읽어들이기 위한 객체 생성
		Scanner scan = new Scanner(System.in);
		System.out.print("여기에 문자열 입력:");
		// 콘솔창으로부터 문자열 읽어들일 때
		String str = scan.next();
		
		System.out.println("main 메소드가 종료되었습니다.");
	}
}
