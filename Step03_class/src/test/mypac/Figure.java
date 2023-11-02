package test.mypac;

/*
 * 사각형 폭, 높이를 필드에 저장할 수 있어야 한다.
 * 픽드에 저장된 폭과 높이를 이용해서 사각형의 넓이를 콘솔창에 출력하는 메소드를 가지고 있어야 한다.
 * 필드와 메소드는 모두 non static으로 만들어라
 * 클래스명, 필드명, 메소드 명은 알아서 만들어라
 */
public class Figure {
	
	public int width; // 선언했더라도 없는 상황이나 마찬가지이다. 그래서 사용을 원할 경우 new라는 예약어 필수
	public int height;

	public void area(){
		int area = width*height;
		System.out.println(area);
	}
}
