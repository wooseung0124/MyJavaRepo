package test.main;

import test.mypac.HandPhone;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * Phone 클래스를 상속받은 HandPhone 클래스로 객체를 생성해서
		 * 그 참조값을 p1이라는 이름의 지역변수에 담기
		 */
		HandPhone p1 = new HandPhone();
		/*
		 * HandPhone 클래스의 생성자를 호출해서 객체를 생성했더니
		 * Phone 클새스의 생성자도 호출되는 걸 알 수 있다.
		 * 따라서 HandPhone 객체도 생성되고 Phone 객체도 같이 생성되었다는 걸 유추할 수 있다.
		 * Phone 객체와 HandPhone 객체가 생성되고 같은 사물함에 들어간다.
		 * 즉, 하나의 참조값으로 Phone 의 기능, HandPhone의 기능을 모두 사용할 수 있다.
		 */
		p1.call(); // Phone 클래스
		p1.mobilecall(); // HandPhone 클래스
		p1.takePicture(); // HandPhone 클래스
		
		/*
		 * 부모(Phone 클래스)와 자식(HandPhone 클래스)
		 * 자식 클래스(사물함) 내에 부모 클래스가 들어감
		 * 자식을 객체선언하면 부모가 먼저 생성하고 자식이 나중에 같이 따라온다.
		 * 부모 클래스에서 어려운 코드로 작성했다고 가정할 때
		 * 자식 클래스 내에서 this(지역변수)만 선언해도 부모 객체 사용가능
		 * 상속받은 객체 : 부모 / 부모로부터 재산상속을 받았다
		 */
	}
}
