package test.main;

import test.mypac.Bike;

public class MainClass04 {
	public static void main(String[] args) {
		
		/*
		 * 1. bike 객체를 담을 수 있는 방 3개짜리 배열객체를 생성해서 참조값을
		 * bikes라는 지역 변수에 담아보세요.
		 * 2. 배열의 각각의 방(0,1,2,번) 에 bike객체를 생성해서 담아보세요
		 * 3. 반복문 for문을 이용하여 순서대로 배열의 각각의 방에 있는 bike 객체의
		 * ride() 메소드를 호출해보세요
		 */
		
		Bike[] bikes = new Bike[3];
		
		Bike bike1 = new Bike();
		Bike bike2 = new Bike();
		Bike bike3 = new Bike();
		
		bikes[0]= bike1;
		bikes[1]= bike2;
		bikes[2]= bike3;
		
		for(int i=0; i<bikes.length; i++){
			bikes[i].ride();
		}
		
		// 확장 for 문을 사용하면 아래와 같다.
		for(Bike tmp: bikes) {
			tmp.ride();
			//배열내에 들어있는 객체의 타입으로 잘 설정하면 됨
		}
		
	}
	/*
	 * 알아낸 거: for문 내에 있는 i의 경우, 타입은 대부분 int로 활용된다
	 * 나는 Bike[] 랑 Bike로 시도했다.
	 * for문 i는 배열순서를 나타내는 요소이기에 숫자라고 볼 수 있다. int다.
	 */
}
