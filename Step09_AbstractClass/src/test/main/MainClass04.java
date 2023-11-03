package test.main;



public class MainClass04 {
	public static class Gura{
		public void say() {
			System.out.println("안녕 나는 구리구리 너구리야");
		}
	}
	public static void main(String[] args) {
		/*
		 * Gura g = new Gura();
		 * ㄴ> 에러나는 이유는? static 영역은 별도의 저장공간이기 때문이다.
		 * ㄴ> 아무리 MainClass04 내에 작성했더라도 static 입장에서는 main 클래스만 들어있지 Gura는 없다
		 * ㄴ> Gura 역시 사용하기 위해선 'static'을 선언하면 된다.
		 */
		
		Gura g = new Gura();
		g.say();
		
		class Cat{ // 메서드 내에 클래스, 지역내부클래스(Local Inner class)
			public void say() {
				System.out.println("안녕 나는 야옹이다옹");
			}
		}
		
		Cat c = new Cat();
		c.say();
	}
}
