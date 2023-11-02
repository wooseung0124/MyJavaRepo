package test.main;

import java.util.Scanner;

import test.mypac.Phone;

/*
 * java 에서 사용하는 모든 data는 Object type 변수나 필드에 담을 수 있다.
 */
public class MainClass07 {
	public static void main(String[] args) {
		// 기본 data type 은 Wrapper Class type으로 간주되어서 담긴다.
		Object a = 10;//Integer
		Object b = true;//Boolean
		Object c = 'a';//Character
		//모든 참조 data type은 당연히 Object type도 된다.
		Object d = "adcd";
		Object e = new Phone();
		Object f = new Scanner(System.in);
		
		// 모든 타입의 데이터 담을 수 있음
		Object[] objs = new Object[5];
		
		objs[0]=10;
		objs[1]=true;
		objs[2]="kim";
		objs[3]=new Phone();
		objs[4]=new Scanner(System.in);
		// 예시라서 모든 타입을 넣어봤지만 실제로는 한가지 타입만 넣고 관리한다.
		
		// 문제1. 지역변수 e에 저장된 참조값을 이용해서 전화를 걸어보세요.
		Phone callcall = (Phone)e;
		callcall.call();
		/*
		 * 상상하자
		 * 1. Object e = new Phone(); => 음식상자(Object) 안에 참치김밥(new Phone)이 들어있음
		 * 원하는 거 : e.call; => Phone 내에 call()실행 => 참치김밥 꺼내기
		 * 2. Phone callcall = (Phone)e; => 음식상자 안에 참치김밥 상자라고 가정하고 꺼낼 수 있게 명시
		 * 3. callcall.call(); => 음식상자를 참치김밥 상자라고 간주하고 꺼내니 정말 참치김밥 나옴
		 * ㄴ> 상속이 된 관계이기에 가능한 것
		 */
		
		// 문제2. objs 배열의 3번 방에 있는 참조값을 이용해서 전화를 걸어라.
		Phone p2 = (Phone)objs[3];
		p2.call();
		// 더 줄일 수 있을까?
		
		// 1. (Phone)objs[3].call; => 에러
		// 2. ((Phone)objs[3]).call; => 소괄호 계산처리 후 호출
		
	}
}
