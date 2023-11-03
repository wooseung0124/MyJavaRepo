package test.mypac;

public class Zoo {//Zoo라는 설계도
	//클래스 안에 클래스(내부 클래스 Inner Class)
	public class Monkey{// @@ 데이터 타입 : Zoo.Monkey type @@
		
		public void say() {
			System.out.println("안녕 나는 몽키몽키매직 몽키매직이야.");
		}
	}
	
	//내부 클래스
	public class Tiger{
		public void say() {
			System.out.println("안녕 나는 어흥어흥 호랑이야.");
		}
	}
	
	public Monkey getMonkey() {
		//내부 클래스로 객체를 생성해서 리턴해주기
		return new Monkey();
	}
	
	public Tiger getTiger() {
		return new Tiger();
	}
}
