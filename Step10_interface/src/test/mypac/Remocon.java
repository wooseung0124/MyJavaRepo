package test.mypac;

/*
 * 실행할 코드를 가질 수 없다.
 * 추상클래스만 만들 수 있음.
 * 완성된 코드는 존재하지 않음.
 * 구현기능 말고 모양만 만들기
 * 
 * [interface]
 * 
 *  - 생성자가 없다(단독 개체 생성불가)
 *  - 필드는 static final 상수만 가질 수 있다
 *  - data type 의 역할을 할 수 있다.
 *  - interface type 의 참조값이 필요하면 구현(implements) 클래스를 만들어서
 *  객체를 생성해야 한다.
 *  - 클래스 상속은 단일 상속이지만, 인터페이스는 다중 구현이 가능하다.
 */
public interface Remocon {
	// 필드는 static final 필드만 가질 수 있다(static final은 생략 가능)
	public String COMPANY="LG";
	public void up();
	public void down();
}
