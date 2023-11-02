package test.main;

import test.mypac.Airplane;
import test.mypac.Test;

public class MainClass01 {
	public static void main(String[] args) {
		Test t = new Test();
		//return type 이 void인 메소드 호출
		t.walk();
		//return type 이 int 인 메소드 호출하고 리턴되는 값을 a라는 int type 지역변수에 담기
		int a=t.getNumber();
		//return type 이 String 인 메소드 호출하고 리턴되는 값을 b라는 String type 지역변수에 담기
		String b = t.getGreeting();
		
		//return type 이 AirPlane 인 메소드 호출하고 리턴되는 값을 c라고 Airplane type 지역변수에 담기
		Airplane c=t.getPlane();
		c.fly();
		
		//위에서 생성한 객체 setNum() 메소드를 호출하라
		t.setNum(10);
		//위에서 생성한 객체 setName() 메소드를 호출하라
		t.setName("kim");
		//위에서 생성한 객체 setPlane() 메소드를 호출하라
		t.setPlane(new Airplane());
	}
}
