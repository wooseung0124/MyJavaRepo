package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MainClass03 {
	public static void main(String[] args) {
		new ArrayList<String>();
		// 링크 : https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html#ArrayList()
		// ArrayList 안에는 4개의 상속관계와 6개의 만들어진 인터페이스, 총 10개의 타입이 존재한다.
		// ArrayList를 통해 add, get, set, remove, clear 등 사용했는데 이건 10개 타입중에 list 타입을 통해 사용한 것
		
		// 인삿말을 담을 ArrayList 객체를 생성해서 참조값을 LIst 인터페이스 type 지역변수에 대입하기
		List<String> greets = new ArrayList<String>();
		greets.add("hello");
		greets.add("hi");
		greets.add("good night");
		
		Consumer<String> con = new Consumer<>() {
			
			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
		};
		
		// forEach() 메소드는 Consumer 인터페이스 type을 매개 변수로 전달해야한다.
		// @@ 인터페이스는 단독객체 생성 불가하니 익명 클래스 혹은 하위 클래스 호출해야한다. @@
		// 위 코드처럼 익명 클래스를 통해 호출할 메서드를 가지고 있는 객체를 호출하는 방식으로 구현한다.
		greets.forEach(con);
		
		System.out.println("======둠칫======");
		
		greets.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
			
		});
		
		System.out.println("======담칫======");
		
		// 오버라이딩이 하나만 있을 경우는 자바스크립트 형식으로 구현도 가능
		greets.forEach((t)->{
			System.out.println(t);
		});
	}
}
