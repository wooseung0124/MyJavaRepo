package test.mypac;

/*
 * 클래스 안에는 객체(field, method)가 있음
 * field 생성시 고려사항: public field(공유필드), data type, field name
 * 
 * [메소드를 만들 때 고려 해야하는 것]
 * 1. 접근 지정자(모르면 public)
 * 2. static or non static(모르면 non static)
 * 3. 리턴 type(모르면 void)
 * 4. 메소드명
 * 5. 메소드에 전달하는 인자의 개수와 데이터 type
 */
public class Test {
	/*
	 * public => 패키지가 달라도 호출가능
	 * void => 이 메소드는 어떤 값도 리턴하지 않는다
	 * ㄴ javascript 에 있는 undefind 값도 없다는 의미
	 * walk => 메소드명은 walk
	 * ()=> 이 메소드는 어떤 값도 인자로 전달받지 않은 메소드이다(매개변수가 선언되지 않고 비어있음)
	 */
	public void walk() {
		System.out.println("걸어요!");
	}
	/*
	 * int => 이 메소드를 호출한 그 위치로 int type 값을 되돌려 주는 메소드
	 */
	
	public int getNumber() {
		int num = 10;
		return num;
	}
	
	/*
	 * String => 이 메소드를 호출한 그 위치로 String type 참조값을 되돌려 주는 메소드
	 */
	
	public String getGreeting() {
		String greet = "안녕하세요";
		return greet;
	}
	public Airplane getPlane() {
		Airplane p1 = new Airplane();
		return p1;
	}
	
	//int type 을 메소드의 인자로 전달 받는 메소드
	public void setNum(int num) {
		// 매개변수를 모르겠으면 대입연산자=라고 생각하자.                                                                              
	}
	//String type 을 메소드의 인자로 전달받는 메소드
	public void setName(String name) {
		
	}
	//Airplane type 을 메소드의 인자로 전달받는 메소드
	public void setPlane(Airplane plane) {
		
	}
	//int type, String type, Airplane type 3개를 전달받는 메소드
	public void doSomething(int num, String name, Airplane plane) {
		
	}
	//오버로딩: 다중정의 => 동일 변수명이 많이 정의됨
	public void send() {
		System.out.println("무언가를 전송해여");
	}
	public void send(int num) {
		System.out.println(num+"을 전송해요");
	}
	public void send(String name) {
		System.out.println(name+"을 전송해요");
	}
	public void send(Airplane pland) {
		System.out.println("비행기를 전송해요");
	}
}
