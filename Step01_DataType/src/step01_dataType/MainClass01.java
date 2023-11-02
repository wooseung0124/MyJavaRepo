package step01_dataType;

/*
 *  [ Java 기본 데이터 type ]
 *  
 *  1. 숫자형
 *  
 *  정수형 : byte, short, int, long
 *  
 *  - byte 변수명;  // -128 ~ 127
 *  - short 변수명;  // -32768 ~ 32767
 *  - int  변수명; // -2,147,483,648 ~ 2,147,483,647
 *  - long 변수명; // -9223372036854775808 ~ 9,223,372,036,854,775,807
 *  
 *  실수형 : float, double
 *  
 *  - float 변수명; // 1.40129846432481707e-45 ~ 3.40282346638528860e+38
 *  - double 변수명; //4.94065645841246544e-324d ~ 1.79769313486231570e+308d
 *  
 *  type 별로 숫자가 다른 이유 : 메모리 전략, 같은 수의 1이라도 메모리를 차지하는 자릿수는 타입별로 차지하는 자릿수로 저장된다.
 */

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		//정수형 변수 선언하고 값 대입하기
		byte iByte = 10;
		short iShort = 10;
		int iInt=1000;
		long iLong=10000;
		// 문법 : data type 변수명 = 값;
		
		int tmp = iShort;
		// 더 큰 타입의 변수안에 작은 타입 요소를 넣어도 문제없음
		// int 변수라고 정의했지만 short 타입이 들어간 상황이다.
		
		// byte tmp2 = iShort;
		// 작은 타입의 변수안에 큰 타입 요소를 넣으면 에러발생
		
		byte tmp2 = (byte)iShort;
		/** 
		 * 대신 작은 타입 변수 안에 큰 타입 변수를 넣으려고 하더라도
		 작은 타입 범위 내에 작은 숫자가 들어갔을 경우에는 강제로 넣을 순 있다.
		 casting 연산자라고 부른다.
		 물론 큰 숫자라면 에러난다.
		 */
		
		//실수형 변수 선언하고 값 대입하기
		float num1 = 10.1f;
		double num2=10.2d;
		double num3=10.3;// d, f를 붙이지 않으면 double type으로 간주된다.
		
		// float type에 있는 값을 double type에 담기
		double tmp3=num1;
		
		float tmp4=(float)num2;
		
		System.out.println("main 메소드가 종료됩니다.");
		// 자동완성법 : syso 입력 -> 컨트롤+스페이스바
	}
}
