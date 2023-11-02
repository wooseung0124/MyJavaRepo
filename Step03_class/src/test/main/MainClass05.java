package test.main;

import java.io.PrintStream;

/*
 * System.out.println();
 * 에 대한 내용
 */

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 * System 클레스에는 out 이라는 static 필드가 존재함
		 * 거게이는 콘솔창과 연결된 PrintStream type 객체의 참조값이 들어있다.
		 */
		PrintStream a = System.out; //static 필드 참조
		a.println("안녕!");

		//System 클래스의 static 메소드 호출
		Long time = System.currentTimeMillis();
		
		/*
		 * current : 1970.01.01 00시 기준 지금까지 지난 시간을 초단위로 환산
		 */
	}
}
