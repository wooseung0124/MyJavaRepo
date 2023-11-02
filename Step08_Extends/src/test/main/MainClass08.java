package test.main;

import test.auto.Car;
import test.auto.Engine;

public class MainClass08 {
	public static void main(String[] args) {
		//Car 객체를 생성해서 참조값을 car1이라는 지역 변수에 담아보세요.
		Car car1 = new Car(new Engine());
		//car1에 .을 찍어서 drive()메소드를 호출하라.
		car1.drive();
		
		Car car2 = new Car(null);
		car2.drive();
	}
}
