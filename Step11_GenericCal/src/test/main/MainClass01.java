package test.main;

import test.mypac.Apple;
import test.mypac.FruitBox;
import test.mypac.Melon;
import test.mypac.Orange;

public class MainClass01 {
	public static void main(String[] args) {
		//box,box2,box3에 .을 찍어서 차이점 확인
		FruitBox<Apple> box = new FruitBox<Apple>();
		
		FruitBox<Orange> box2 = new FruitBox<Orange>();
		
		//객체 생성시에 Generic type은 생략 가능하다.
		FruitBox<Melon> box3 = new FruitBox<>();
		
		//Generic 클래스가 Apple 로 되어있는 객체 사용하기
		box.pack(new Apple()); // Apple type 을 매개변수에 전달
		Apple f1 = box.unPack(); // Apple type 이 리턴된다.
		
		//Generic 클래스가 Orange로 되어있는 객체 사용하기
		box2.pack(new Orange()); // Orange type 을 매개변수에 전달한다.
		Orange f2 = box2.unPack(); // Orange type 이 리턴된다.
		
		// 제네릭은 클래스 타입만 적용 가능, 기본형의 경우는 래퍼클래스
	}
}
