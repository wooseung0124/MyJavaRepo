package step01_dataType;

/*
 * [Java 참조 데이터 type]
 * 
 * String type
 * 
 * - 문자열을 다룰 때 사용하는 데이터 type이다.
 */

public class MainClass05 {
	public static void main(String[] args) {
		// "김구라" 라는 string type 객체를 heap 영역(사물함)에 만들고 그 참조값을 변수에 담기
		String name = "김구라";
		// name 안에 있는 참조값을 tmp 변수에 복사하기
		String tmp = name;
		// "원숭이" 라는 string type 객체를 heap 영역에 만들고 그 참조값을 name 변수에 덮어쓰기
		name="원숭이";
		// name 변수를 비우기(null은 참조 데이터 type 이 담길 수 있는 빈 공간을 의미)
		name=null;
		System.out.println(tmp);
	}
	
	/*
	 * 변수를 나라고 생각해보자. 그리고 내 눈앞에는 가상의 사물함 전체가 있다고 가정하자.
		values 는 한 칸의 열쇠키를 가지고 사물함 안에 값을 넣는다 생각하면 된다.
		또 다른 변수를 친구라고 생각하자. 변수값 안에 다른 변수값을 선언한다면 키를 복사해서
		같은 칸 사물함을 사용한다 생각하면 이해하기 쉽다.
		values 가 변동되면 다른 열쇠를 만들어서 다른 칸의 사물함 안에 넣는다 생각하면 된다.
	 */
}
