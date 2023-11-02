package test.main;

// java.util 패키지의 Random클래스 import
import java.util.Random;

public class MainClass04 {
	public static void main(String[] args) {
		//객체 생성후 참조값을 Random type 지역변수 ran에 담기
		Random ran = new Random();
		//정수 범위 내에서 랜덤한 정수 하나 얻어내기
		int ranNum = ran.nextInt();
		System.out.println(ranNum);
		//0이상 10미만 범위내에서 랜덤한 정수 하나 얻어내기(0~9)
		int ranNum2=ran.nextInt(10);
		System.out.println(ranNum2);
		
		// nextInt() 같은 이름으로 3개나 있음, 이걸 오버로딩
	}
}
