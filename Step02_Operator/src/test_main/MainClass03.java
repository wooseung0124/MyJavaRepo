package test_main;

/*
 * 3. 비교 연산자 테스트
 * 비교 연산의 결과는 boolean type을 리턴해준다.
 * 
 * ==, !=, >, >=, <, <=
 */
public class MainClass03 {
	public static void main(String[] args) {
		boolean result1 = 10 == 10; //true
		boolean result2 = 10 != 10; //false
		boolean result3 = 10 > 10;  //f
		boolean result4 = 10 >= 10; //t
		boolean result5 = 10 < 100; //t
		boolean result6 = 10 <= 10; //t
		
		// String type 변수 name에 null 대입
		String name = null;
		
		// null 인지 아닌지 비교 가능하다(즉 java에서 null 값은 비교가 가능)
		boolean result7 = name == null; //t
		boolean result8 = name != null; //f
	}
}
