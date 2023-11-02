package step01_dataType;

public class MainClass02 {
	public static void main(String[] args) {
		// main 누르고 컨트롤 +스페이스
		
		// 1. 콘솔창에 "main 메소드가 시작되었습니다." 출력
		System.out.println("main 메소드가 시작되었습니다.");
		
		// 2. 국어점수 95를 kor 이라는 변수에 넣어보기
		int kor = 95;
		
		// 3. 영어점수 100을 eng라는 변수에 넣기
		int eng = 100;
		
		// 4. 국어 점수와 영어 점수의 평균을 구해서(연산자 활용) avg라는 변수에 넣기
		double avg = (kor+eng)/2d;
		// int끼리 연산하면 결과도 int다. avg를 double로 적용해도 int 결과가 나올 것이다.
		// 때문에 d를 추가하든 2.0으로 수정해야된다.
		
		// 5. 콘솔창에 avg 변수 안에 담긴 내용 출력하기
		System.out.println(avg);
	}
}
