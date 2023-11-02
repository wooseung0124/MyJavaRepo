package test.mypac;
/*
 * new Student 문법 파헤치기
 * 생성자를 call하는 표현식
 * constructor 를 call 하는 표현식
 * 클래스는 최소 하나의 constructor를 가지고 있다.
 */
public class Student {
	
	// 생성자(constructor): 리턴(void)값이 정의되지 않음
	// ㄴ 클래스명과 동일해야함
	public Student() {
		//객체를 생성하는 시점에 무언가 준비작업을 하고 싶으면 여기서 한다.
		System.out.println("Student() 생성자 호출됨");
	}
	
	/*
	 * public Student(){} 코드가 없다고 가정해보자(실제로 지워도 mainclass01 에러는 없음)
	 * 생성자를 명시적으로 정의 하지 않아도
	 * 위와같은 default 생성자는 있다고 간주된다.
	 * 
	 * 따라서 생성자를 따로 만들지 않아도 new Student()해서 객체를 생성할 수 있다.
	 */
	
	public void study() {
		System.out.println("공부해요");
	}
	
}
