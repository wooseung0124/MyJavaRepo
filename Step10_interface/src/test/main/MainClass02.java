package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass02 {
	public static void main(String[] args) {
		// 다형성
		MyRemocon r1 = new MyRemocon();
		Remocon r2=r1;
		Object r3=r1;
		
		useRemocon(r1);
		useRemocon(r2);
		// useRemocon(r3); // 호출불가
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
