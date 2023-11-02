package test.main;

import test.mypac.Car;

public class MainClass03 {
	public static void main(String[] args) {
		//Car 객체를 생성해서 사용하지 않고 버림
		new Car();
		
		//Car 객체를 생성해서 1회성으로 사용하고 버림
		new Car().drive();
		
		//Car 객체를 생성해서 나온 참조값을 c1 이라는 Car type 지역변수에 담아놓고
		Car c1 = new Car();
		//필요할 때 마다 c1에 .찍어서 여러번 사용할 수 있다.
		c1.drive();
		c1.drive();
		
		// javascript 에선 실행 후 반환되는 리턴값인 undefind가 있다.
		// java는 void라는 개념이 있는데 반환될 값이 없다는 의미이다.
		// 적어도 반환될 값이 무엇인지 지정해야한다.
		// 메소드명() 다음에 콜론(:) 문법이 있다면 그 뒤에 있는 타입이 리턴값이다.
	}
}
