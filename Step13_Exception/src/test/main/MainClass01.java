package test.main;

import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자입력 : ");
		// 숫자 형식의 문자열을 입력 받는다 "10","20","10.1" 등등
		String inputNum = scan.nextLine();
		
		// 내가 코틀린할 적에 몰랐던 내용들
		try {
			// 입력한 숫자를(문자열) 실제 숫자로 바꾼다.
			double num=Double.parseDouble(inputNum);// JVM(Java Vitual Machine)에서 처리해줌
			//입력한 숫자에 100을 더한다.
			double result=num+100;
			System.out.println("입력한 숫자 +100 : "+result);
		}catch(NumberFormatException nfe) {
			/*
			 * 실행 스택에서 일어난 일을 콘솔창에 출력하기
			 * (자세한 예외 정보를 예외객체가 콘솔창에 출력하게 하기)
			 * 예외객체 발생시 catch 메소드가 콜되는 느낌
			 * 이 영역은 JVM이 처리하지 않는다.
			 */
			nfe.printStackTrace();
		}
		
		System.out.println("무언가 중요한 마무리 작업을 하고 main 메소드가 종료");
	}
}
