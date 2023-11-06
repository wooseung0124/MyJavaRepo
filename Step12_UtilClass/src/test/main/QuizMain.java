package test.main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class QuizMain {
	public static void main(String[] args) {
		/*
		 * Scanner 객체를 이용해서 반복문 돌면서 3명의 이름을 입력 받고
		 * ArrayList 객체에 순서대로 저장하기
		 * 다 저장한 뒤엔 반복문 돌려서 ArrayList에 저장된 3명의 이름을 순서대로 콘솔창에 출력하기
		 */
		
		Scanner scan = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<>();
		
		for(int i=0; i<3; i++) {
			System.out.println(i+1+"번째 친구이름 작성해주세요");
			String str = scan.nextLine();
			names.add(str);
		}
		
		names.forEach(new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
	}
}
