package step01_dataType;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		//지역변수를 선언만 한다면?
		
		int num;
		String name1;
		
		/*
		 * 자바스크립트에서는 'undefined'라도 생성되었지만 자바는 아예 안됨
		 * 
		 * 아직 만들어 지지 않았기 때문에 num1은 참조 불가
		 * int result = 10+num;
		 * 아직 만들어지지 않았기 때문에 name1은 참조 불가
		 * System.out.println(name1);
		 */
		
		System.out.println("main 메소드가 종료 되었습니다.");
	}
}
