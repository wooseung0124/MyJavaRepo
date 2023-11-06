package test.main;

import java.util.ArrayList;

/*
 * Java 에서 배열은 크기를 조절할 수 없는 고정 배열이다.
 * 따라서 동적으로 item 을 추가하고 삭제하고 하는 작업을 하려면 일반배열은 사용할 수 없다.
 * 그래서 해당 작업을 하려면 ArrayList 객체를 사용하면 된다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		//String type을 순서대로 저장할 수 있는 ArrayLIst 객체 생성하고 참조값을 names에 담기
		ArrayList<String> names = new ArrayList<>();
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		// 0번방의 아이템을 불러와서 item 이라는 변수에 담기
		String item = names.get(0);
		
		// 1번방 아이템 삭제 방법은?
		names.remove(1);
		
		// 0번방에 "에이콘" 을 넣고 싶다면?
		names.set(0, "에이콘"); // 해당 배열 내에 객체를 수정(덮어쓰기)
		names.add(0, "에이콘"); // 객체를 넣고 뒤에 있는 요소 뒤로 밀기(끼워넣기)
		
		// 저장된 아이템의 개수(size)를 size라는 지역 변수에 담기
		int size = names.size();
		
		// 저장된 모든 아이템 전체 삭제
		names.clear();
		
		// @@ 주로 사용하는 명령어 : add, get @@
	}
}
