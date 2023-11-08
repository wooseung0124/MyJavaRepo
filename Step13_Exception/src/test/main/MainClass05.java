package test.main;

import test.mypac.MyUtil;

public class MainClass05 {
	public static void main(String[] args) {
		//메소드 안에서 발생하는 예외를 직접 처리한 draw() 메소드 호출
		MyUtil.draw();
		
		//MyUtil에서 책임전가 받은 클래스, 호출 시 try-catch문을 작성함
		try {
			MyUtil.send();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
