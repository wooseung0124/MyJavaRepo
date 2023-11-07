package test.main;

import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자입력 : ");
		// 숫자 형식의 문자열을 입력 받는다 "10","20","10.1" 등등
		String inputNum = scan.nextLine();
		// 입력한 숫자를(문자열) 실제 숫자로 바꾼다.
		double num=Double.parseDouble(inputNum);// JVM(Java Vitual Machine)에서 처리해줌
		//입력한 숫자에 100을 더한다.
		double result=num+100;
		System.out.println("입력한 숫자 +100 : "+result);
		System.out.println("무언가 중요한 마무리 작업을 하고 main 메소드가 종료");
	}
}
