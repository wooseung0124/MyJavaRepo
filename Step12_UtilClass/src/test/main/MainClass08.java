package test.main;

import java.util.HashMap;

public class MainClass08 {
	public static void main(String[] args) {
		/*
		 * HashMap <key type, value type>
		 * 
		 * key type 은 일반적으로 String type을 가장 많이 사용(다른 것도 사용할 순 있으나 거의 String 사용)
		 * value type 은 담고 싶은 데이터의 type을 고려해서 지정하면 됨
		 * value type 을 Object 로 지정하면 어떤 data type 이든지 다 담을 수 있다
		 * 순서가 없는 데이터를 다룰 때 사용하면 됨
		 * dto 클래스 대신에 사용하기도 하다.
		 * 대신 꺼낼 때는 '캐스팅'으로 전환해서 사용해야한다.
		 */
		HashMap<String, Object> map = new HashMap<>();
		map.put("num",1);
		map.put("name","김구라");
		map.put("isMan", true);
		
		// value 의 generic 클래스가 Object 이기 때문에 Object type 이 리턴된다.
		int num=(int)map.get("num"); // 원래 type으로 casting 이 필요!
		String name=(String)map.get("name");
		boolean isMan=(boolean)map.get("isMan");
	}
}
