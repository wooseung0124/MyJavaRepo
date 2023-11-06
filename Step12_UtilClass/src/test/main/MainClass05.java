package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Member;

public class MainClass05 {
	public static void main(String[] args) {
		//1. Member 객체를 담을 수 있는 ArrayList 객체를 생성해서 참조값을 members 라는 지역변수에 담기
		List<Member> members = new ArrayList<>();
		
		//2. 3명의 회원정보를 Member 객체에 각각 담기(Member 객체가 3개 생성되어야 함)
		Member member1 = new Member(1,"김구라","노량진");
		Member member2 = new Member(2,"해골","행신동");
		Member member3 = new Member(3,"원숭이","동물원");
		
		//3. 위에서 생성된 Member 객체의 참조값을 ArrayList 객체에 모두 담아보기
		members.add(member1);
		members.add(member2);
		members.add(member3);
		
		/*
		 * 4. members List 객체에 담긴 내용을 이용해서 회원 목록을 아래와 같은 형식으로
		 * 반복문 돌려서 출력해보기
		 * 
		 * 번호: 1, 이름: 김구라, 주소: 노량진
		 * 번호: 2, 이름: 해골, 주소: 행신동
		 * 번호: 3, 이름: 원숭이, 주소: 동물원
		 */
		
		for(Member tmp: members) {
			System.out.println("번호: "+tmp.num+", 이름: "+tmp.name+", 주소: "+tmp.addr);
		}
		
		members.forEach((tmp)-> {
			// String 작성 후 . 찍어보기
			// 빨간색 S : static 메소드
			String result = String.format("번호: %d, 이름: %s, 주소: %s", tmp.num, tmp.name, tmp.addr);
			System.out.println(result);
		});
	}
}
