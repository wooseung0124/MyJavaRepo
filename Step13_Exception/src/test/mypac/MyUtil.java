package test.mypac;

import java.util.ArrayList;
import java.util.List;

public class MyUtil {
	//문자열을 전송하는 가상의 클래스
	public static void sendMessage(String msg) {
		
		/*
		 * 전송할 문자열에 금지어가 있는지 확인하기
		 * 메소드명 : contains / 타입: CharSequence -> String 타입으로 구현한 인터페이스
		
		if(msg.contains("바보")){
			// 예외 발생시키기(throw)
			throw new WordFilterException("바보는 금지된 단어입니다.");// JVM(Java Vitual Machine)에서 처리해줌
			// 이렇게만 하면 이후로 앱이 종료됨, mainclass06에서 수정하기
		}
		
		*/
		
		/*
		 * 만약 금지어가 여러개라면??
		 */
		
		List<String> list=new ArrayList<String>();
		list.add("바보");
		list.add("똥깨");
		list.add("멍청이");
		list.add("시발");
		list.add("찌발");
		
		// list 내에 msg 단어와 일치한 데이터가 있는 지 반복문으로 찾기
		list.forEach((tmp)->{
			if(msg.contains(tmp)) {
				throw new WordFilterException("입력하신 단어("+msg+")는 금지된 단어입니다.");
			}
		});
		
		System.out.println(msg+"를 전송했습니다.");
	}
	
	//5초가 걸리는 가상의 그림을 그리는 메소드
	public static void draw() {
		System.out.println("5초 동온 그림을 그려요...");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("그림 완성");
	}
	
	//5초가 걸리는 가상의 전송을 하는 메소드
	public static void send() throws InterruptedException { // 예외처리 책임을 다른 곳에 떠넘기는 코드
		System.out.println("5초 동안 전송을 해요...");
		
		Thread.sleep(5000);
		
		System.out.println("전송완료");
	}
	
}
