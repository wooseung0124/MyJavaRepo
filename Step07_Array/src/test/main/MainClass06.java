package test.main;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		//1.문자열을 저장할 수 있는 방 5개짜리 배열객체를 생성해서 참조값을 msgs라는 지역변수에 담는다.
		String[] msgs = new String[5];
		
		//2. 키보드로부터 입력 받을 수 있는 Scanner 객체를 생성해서 참조값을 scan이라는 지역변수에 담는다.
		Scanner scan = new Scanner(System.in);
		
		/*
		 *3. 반복문을 위에서(1번) 생성한 배열의 방의 개수만큼 돌면서 키보드로부터 문자열을 입력받아서
		 * 배열에 순서대로 저장한다.
		 */
		
		for(int i=0; i<msgs.length;i++) {
			//입력하라 표시
			System.out.print("문자열 입력 : ");
			//입력받기
			String str = scan.nextLine();
			//바깥 배열객체에 저장하기
			msgs[i]=str;
		}
		//4. 반복문 돌면서 배열에 저장되었던 모든 문자열을 순서대로 콘솔창에 출력한다.
		for(String outPrint : msgs) {
			System.out.println(outPrint);
		}
		/*
		 * 알게 된 거: i를 쓰냐 안 쓰냐에 따라 달리 적용한다.
		 */
	}
}
