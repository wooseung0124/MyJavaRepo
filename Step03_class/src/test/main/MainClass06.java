package test.main;

/*
 * 
 */

public class MainClass06 {
	/*
	 * MainClass06는 static 영역에 있는 main 을 포함하기 위해 같이 static 영역에 저장됨
	 * num과 text()는 static 영역에 없는 자료다.
	 */
	
	// 필드
	// int num = 999;
	
	/*
	 *  메소드
	 *  public void test() {
			
		}
	 */
	
	// static 메소드에서 사용하는 필드는 static 필드로 만들어야 사용할 수 있다.
	static int num = 999;
	static public void test() {
		
	}
	
	public static void main(String[] args) {
		// 같은 클래스 멤버의 경우 클래스명.변수 라는 문법을 준수하지 않아도 된다. ex)MainClass06.num+1;
		int result = num+1;
		
		// ex)MainClass06.test();
		test();
	}
	
	
	
	
}
