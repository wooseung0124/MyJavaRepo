package test.main;

/*
 * run 했을 때 콘솔창에 경과 시간이 출력되는 프로그래밍
 * 
 * 0분1초
 * 0분2초
 * 0분3초
 * .
 * .
 * 1분0초
 * 1분1초
 * .
 * .
 * 2분1초
 * .
 * .
 */
public class QuizMain2 {
	public static void main(String[] args) {
		int secTime = 1;
		int minuteTime = 0;
		
		while(true){// 시간이 계속 진행되어야 하기 때문에 무한 루프가 필요함
			
			try {
				
				Thread.sleep(1000);//1000=1초, 그냥 작성하면 런타임 인셉션 선언을 안해서 오류가 남, 예외처리하기(try-catch)
				System.out.println(minuteTime+"분"+secTime+"초");

				
			}catch(Exception e){
				System.out.println("예외가 발생했습니다.");
				System.out.println("예외 메시지: "+e.getMessage());
			}
			secTime++;
			if(secTime==60) {
				secTime = 0;
				minuteTime+=1;
			}
			
		}
	
	}
}
