package test.mypac;

// 가상의 옛날 가정용 전화기 객체를 생성할 설계도라고 가정
public class Phone {// 어떤 클래스도 상속받지 않으면 자동으로 extends Object된다(표기상 생략)
	//상속관계 : Object > Phone > HandPhone
	
	public Phone() {
		System.out.println("Phone 생성자를 호출함");
	}
	
	//전화거는 메소드
	public void call() {
		System.out.println("전화기를 걸어요");
	}
}
