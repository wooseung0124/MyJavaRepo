package test.main;

import test.mypac.AndroidPhone;
import test.mypac.HandPhone;

public class MainClass06 {
	public static void main(String[] args) {
		//자식에게 사준 일반 핸드폰(인터넷이 안됨)
		HandPhone p1 = new HandPhone();
		
		//엄마! 나도 AndroidPhone 갖고 싶어!
		
		//엄마가 새로운 설명서를 가지고 왔어 이제 그 폰은 AndroidPhone이야
		AndroidPhone p2 = (AndroidPhone)p1;
		
		//진짜? 짱이다
		//나 이제 인터넷 한다!
		p2.doInterent(); // 컴파일 상에서는 문제없음(이유: p1을 안드로이드로 강제설정했으니깐)
		// run 결과 : ClassCastException 오류
		
		
	}
}
