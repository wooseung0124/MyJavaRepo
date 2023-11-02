package test.auto;

public class SportsCar extends Car{
	
	/*
	 *  public class SportsCar extends Car 문법에서 오류나는 이유
	 *  Car 객체는 Engine 객체가 필요하기 때문
	 */
	
	// Engine 객체를 전달받는 생성자
	public SportsCar(Engine engine) {
		/*
		 * super()는 부모 생성자(Car 클래스 생성자)를 의미 : 부모를 가리키는 요소
		 * 부모 생성자에 필요한 값을 자식 생성자에서 받아서 전달해야한다.
		 * super()코드 실행전에 다른 코드가 있으면 안된다.
		 */
		super(engine);
	}
	//메소드(기능)
	public void openDrive() {
		//부모클래스(Car)의 필드를 자식 클래스 내에서 사용가능
		
		if(this.engine==null) {
			System.out.println("Engine이 없어서 달릴 수가 없어요!");
			return; //메소드를 여기서 리턴시키기(종료시키기)
		}
		
		System.out.println("뚜껑을 열고 달려요!");
	}
	
}
