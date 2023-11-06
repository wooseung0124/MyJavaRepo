package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * Interface도 data type의 역할을 할 수 있을까?
		 */
		Remocon r1 = new MyRemocon();
		r1.up();
		r1.down();
		//Remocon 인터페이스에 정의된 static final 상수 참조
		String result = r1.COMPANY; // 상수값 : "LG"
		
		// 변수는 필요시 값 변경 가능
		int num = 10;
		num=20;
		
		//상수는 변경 불가
		final int num2=10;
		// num2=20; 에러
	}
}
