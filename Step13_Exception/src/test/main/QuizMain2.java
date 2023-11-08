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
		int secTime = 0;
		int minuteTime = 0;
		
		while(true){
			
			try {
				
				Thread.sleep(1000);//1000=1초
				secTime+=1;
				System.out.println(minuteTime+"분"+secTime+"초");
				
				if(secTime==59) {
					secTime = 0;
					minuteTime+=1;
				}
				
			}catch(Exception e){
				System.out.println("예외가 발생했습니다.");
				System.out.println("예외 메시지: "+e.getMessage());
			}
		}
	
	}
}
