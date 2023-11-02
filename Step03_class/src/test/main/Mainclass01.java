package test.main;

// 다른 패키지의 클래스를 사용할 때는 import를 해야한다.
import test.mypac.Car;

public class Mainclass01 {
	public static void main(String[] args) {
		//text.mypac.Car 클래스로 객체를 생성하고 생성된 객체의 참조값을 car1이라는 지역변수에 담기
		
		// 데어터 호출
		Car car1 = new Car(); 
		// 왼쪽 type 자리에 적힌 Car의 경우 ctrl+space바를 눌러서 import 값 생성
		
		// new 라는 예약어와 클래스명()을 작성하면 객체가 생성된다.
		car1.drive();
		
		// 필드에 저장된 값 침조(불러오기)
		String a = car1.name;
		
		car1.name="소나타";
		//대입한 이후에 필드 저장된 값 참조(불러오기)
		String b = car1.name;
		
		/*
		 * ====== javascript =======
		 * 
		 * let car1 = {name: null, drive: function(){
		 * console.log
		 * 
		 * car1.drive()
		 * let a = car1.name
		 * car1.name = "소나타"
		 * }
		 */
	}
}
