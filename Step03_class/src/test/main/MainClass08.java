package test.main;

import test.mypac.Figure;

public class MainClass08 {
	public static void main(String[] args) {
		//new 는 객체를 생성할 때 정의를 내리는 예약어
		Figure figure = new Figure();
		figure.width = 20;
		figure.height = 20;
		figure.area();
		
		Figure f2 = new Figure();
		f2.width = 10;
		f2.height = 20;
		f2.area();
	}
}
