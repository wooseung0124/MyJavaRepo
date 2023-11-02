package test_main;

/*
 * 4. 논리연산자 테스트
 */
public class MainClass04 {
	public static void main(String[] args) {
		// or 연산
		/*
		 * 또는 이라고 읽으면 된다.
		 * 
		 * 어느 하나만 true면 결과는 true
		 * 모두다 false일 경우는 false
		 */
		boolean result1 = false || false; // f
		boolean result2 = false || true; // t
		boolean result3 = true || false; // t
		boolean result4 = true || true; // t
		
		/*
		 * and 연산
		 * 그리고 라고 읽으면 된다.
		 * 
		 * 전부 true일 경우 결과는 true
		 * 하나라도 false라면 결과는 false
		 */
		boolean result5 = false && false; // f
		boolean result6 = false && true; // f
		boolean result7 = true && false; // f
		boolean result8 = true && true; // t
		
		/*
		 * not 연산
		 * ~가 아니면 이라고 읽으면 된다.
		 * 
		 * boolean 값을 반전 시킨다.
		 */
		boolean result9 = !true; // f
		boolean result10 = !false; // t
	}
}
