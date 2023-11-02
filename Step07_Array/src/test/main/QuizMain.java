package test.main;

import java.util.Random;

public class QuizMain {
	public static void main(String[] args) {
		/*
		 * 1. run했을 때
		 * cherry, apple, banana, melon, 7
		 * 5개의 문자열 중에서 1개가 랜덤하게 출력되도록 만들어라.
		 * 
		 * hint)
		 * Random 객체와 String[]객체를 활용
		 */
		String[] fruit = {"cherry","apple","banana","melon","7"}; // 참고로 한번 선언하면 줄어들 일도 늘어날 일도 없음
		
		Random random = new Random();
		int ranNum = random.nextInt(fruit.length);
		System.out.println(fruit[ranNum]);

	}
}
