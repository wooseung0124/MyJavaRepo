package test_main;

/*
 * 6. 3항 연산자 테스트
 */
public class MainClass06 {
	public static void main(String[] args) {
		boolean isWait=false;
		//isWait 가 true 면 "기다려요"가 대입, false면 "기다리지 않아요"가 대입
		
		String result = isWait ?"기다려요":"기다리지 않아요";
		// isWait ? "기다려요":"기다리지 않아요";
		// 문법) 변수 ? 값1 : 값2;
		// 해석) 변수가 true면 값1로 적용, false면 값2로 적용
		
		System.out.println(result);
		
		//위에 3항 연산자는 아래와 같이 if~else 문과 같은 로직이다.
		String result2=null;
		if(isWait) {
			//isWait가 true면 수행
			result2="기다려요";
		}else {
			//isWait가 false면 수행
			result2="기다리지 않아요";
		}
		System.out.println(result2);
	}
}
