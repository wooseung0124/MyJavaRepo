package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		// 위에서 아래로 순차적으로 처리하는 과정 : 스레드
		System.out.println("main 메소드가 시작되었습니다.");
		// Thread.sleep(5000); => 런타임이 아닌 컴파일 단계에서 예외(exception)처리 발생
		try {
			//스레드를 일정시간 지연시키기( millis second 단위로 숫자를 전달)
			Thread.sleep(5000);
		}catch(InterruptedException e){ 
			// 부모객체중에 "java.lang.RuntimeException(실행중에)" 이 없으면 무조건 try로 묶어야 된다.
			e.printStackTrace();
		}
		System.out.println("main 메소드가 종료됩니다.");
	}
}
