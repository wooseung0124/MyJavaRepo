package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainClass11 {
	public static void main(String[] args) {
		//sample 데이터
		Map<String, String> dic = new HashMap<>();
		dic.put("house", "집");
		dic.put("phone", "전화기");
		dic.put("car", "자동차");
		dic.put("pencil", "연필");
		dic.put("eraser", "지우개");
		
		/*
		 * [ 콘솔창 실행 결과 1]
		 * 
		 * 검색할 단어를 입력하세요: house
		 * 
		 * house 의 뜻은 집입니다.
		 * 
		 * [ 콘솔창 실행 결과 2]
		 * 
		 * 검색할 단어를 입력하세요 : gura
		 * 
		 * gura는 목록에 없습니다.
		 */
		
//		List<Map<String,String>> dicList = new ArrayList<>();
//		dicList.add(dic.get("house", "집"));
//		dicList.add(dic2);
//		dicList.add(dic3);
//		dicList.add(dic4);
//		dicList.add(dic5);
//				
//		Scanner scanner = new Scanner(System.in);
//		
//		String search = scanner.nextLine();
//		
//		for(int i=0; i<dicList.size();i++) {
//			System.out.println("[ 콘솔창 실행 결과 "+i+" ]");
//			System.out.println("검색할 단어를 입력하세요: ");
//			System.out.println(search);
//			
//			if(dicList.get(i) == search){
//				String result = dic.get(search);
//				System.out.println(result);
//			}
//		}
//	
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("검색할 단어를 입력하세요: ");
		//문자열 입력받기
		String word = scanner.nextLine();
		//입력한 key 값을 이용해서 단어의 뜻을 찾는다(없으면 null이 리턴된다)
		String mean = dic.get(word);
		// System.out.println(mean);
		
		if(mean != null) {
			System.out.println(word+"의 뜻은 "+mean+"입니다.");
		}else {
			System.out.println("입력하신 "+word+"라는 단어는 목록에 없습니다.");
		}
		System.out.println("=====================");
		if(dic.containsKey(word)) {
			System.out.println(word+"의 뜻은 "+mean+"입니다.");
		}else {
			System.out.println("입력하신 "+word+"라는 단어는 목록에 없습니다.");
		}
}
}
