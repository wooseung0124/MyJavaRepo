package test.mypac;

/*
 *  class 의 역할
 *  
 *  1. 객체의 설계도 역할
 *    - 객체는 heap 영역(사물함)에 들어 있는 물건이라고 생각하면 된다. 
 *    - class 를 이용해서 객체를 원하는 시점에 원하는 갯수 만큼 만들어 낼수 있다
 *    - 만들어진 객체가 어떤 저장소와 어떤 기능을 가지게 할지 class 로 설계 할수 있다.
 *    
 *  2. data type 역할
 *  
 *  3. static 필드와 메소드를 포함하는 역할
 *   - public static void main(String[] args) 문법과 관련있음
 *   - System.out.println() 문법도 관련있음
 *   - 필드와 메소드를 heap 영역 내에 객체를 통해 생성했는데 객체가 아닌 다른 장소에 생성하는 방식이다.
 *   - stack 영역에 만든다.
 *  
 */

// 설계도(class) 데이터 타입명(Car) 키값은 존재하나 번호는 알 수 없음
public class Car {
	// 데이터의 저장소(field)
	public String name; // 선언만하고 값을 넣지 않으면 생성시 null로 초기화 된다.
	// name 내에 있는 null은 type 에 따라 car의 동일한 키값 내에 있을 수도 있고 다른 장소에 키값이 선언될 수 있다.
	// 참조 데이터는 다른 키값을 가지고 있다.
	
	public int price; // 0으로 초기화
	
	// 기능(method)
	public void drive() {
		// this는 바로 이 객체의 참조값을 가리키는 예약어이다.
		System.out.println(this.name+"이 달려요");
	}
}
