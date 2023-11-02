package test.auto;
/*
 * 접근 지정자 접근범위
 *
 * public(공유): 전체공개, 어디에서나 접근 가능
 * protected : 동일한 package 혹은 상속관계 접근 가능
 * default(작성 안한 경우) : 동일한 package 안에서만 접근 가능
 * private : 본인만 사용, 동일 클래스 혹은 동일 객체 내에서만 접근 가능
 * 
 * 접근 지정자를 선언하는 위치
 * 
 * 1. 클래스를 선언할 때
 * 2. 생성자
 * 3. 필드
 * 4. 메서드
 * 
 * 클래스는 default 와 public 두가지의 접근 지정자만 지정 가능하다
 * 접근 지정자를 생략한 것이 default 접근 지정자다.
 * 
 *
 */

public class Car {
	//(각 접근 지정자를 수정해보기바람, MiniCar클래스)
	
	//필드
	protected Engine engine;
	//Engine 객체를 생성자의 인자로 전달받는 생성자
	public Car(Engine engine) { // 생성자 혹은 메소드 콜할 경우 정확한 타입을 기입해야 전달할 수 있음
		// new Car(); 을 통해 호출을 원한다면 new Car(new Engine);이라고 기재해야함
		// MainClass08 참고
		
		this.engine=engine;
	}
	
	//메소드
	public void drive() {
		if(this.engine==null) {
			System.out.println("Engine이 없어서 달릴 수가 없어요!");
			return; //메소드를 여기서 리턴시키기(종료시키기)
		}
		System.out.println("달려요~");
	}
}
