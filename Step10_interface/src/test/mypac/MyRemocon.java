package test.mypac;

/*
 * 인터페이스 implements 하면 인터페이스에 정의되어 있는 모든 추상메서드를 오버라이드 해야한다(강제)
 */
public class MyRemocon implements Remocon {

	@Override
	public void up() {
		System.out.println("채널 올리기");
		
	}

	@Override
	public void down() {
		System.out.println("채널 내리기");
	}

}
