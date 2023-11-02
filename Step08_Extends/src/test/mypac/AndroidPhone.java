package test.mypac;

public class AndroidPhone extends HandPhone {
	// 생성자
	public AndroidPhone() {
		System.out.println("AndroidPhone 생성자 호출");
	}

	// 메소드
	public void doInterent() {
		System.out.println("인터넷을 해요");
	}
	
	// 오버라이드 : 기존 데이터를 덮어쓰고 수정한다.
	// 가정 : HandPhone 기능 takePicture()를 수정하고 싶을 경우, Ctrl+space 누르면 상속된 객체 수정가능함
	// @표기는 단순 표시용도임
	@Override 
	public void takePicture() {
		System.out.println("1000만 화소의 사진을 찍어요!");
	}

}
