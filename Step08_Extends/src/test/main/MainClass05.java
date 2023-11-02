package test.main;

import test.mypac.AndroidPhone;

public class MainClass05 {
	public static void main(String[] args) {
		//AndroidPhone 객체를 생성해서 참조값을 AndroidPhone type p1이라는 지역변수에 담기
		AndroidPhone p1 = new AndroidPhone();
		p1.call();
		p1.mobilecall();
		p1.takePicture();
		p1.doInterent();
		
		//오버라이드 : 기존 데이터를 덮어쓰고 수정한다.
		//가정 : HandPhone 기능 takePicture()를 수정하고 싶을 경우(AndroidPhone으로 이동)
	}
}
