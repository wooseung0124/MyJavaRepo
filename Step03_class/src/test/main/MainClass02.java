package test.main;

import test.mypac.Car;

public class MainClass02 {
	public static void main(String[] args) {
		// Car 클래스로 객체를 생성해서 참조값을 car1이라는 Car type 지역변수에 담기
		
		Car car1=new Car();
		Car car2=new Car();
		// head 영역 내에 객체가 지정됨
		// 객체를 볼 수 있는 키값(참조값)은 stack 이라는 메모리 영역에 붙어넣기
		// 그리고 메모리 내에는 클래스 타입명이 저장된다. 우린 그걸 지역변수라고 한다.
		
		// 필드에 String type의 참조값 대입하기
		car1.name = "소나타";
		car2.name = "그랜저";
		
		// 매소드 호출하기
		car1.drive();
		car2.drive();
		
		// 다른 객체이므로 false가 된다.
		boolean result = car1 == car2;
		
		Car car3=car2;
		car3.drive(); // 그랜저
		
		// 동일객체(같은 참조값)이므로 true이다.
		boolean result2 = car2 == car3;
	}
}
