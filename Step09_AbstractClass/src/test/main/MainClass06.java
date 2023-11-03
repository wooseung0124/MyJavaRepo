package test.main;

import test.mypac.Weapon;

public class MainClass06 {
	public static void main(String[] args) {
	
		 Weapon w1 = new Weapon() {

			@Override
			public void attack() {
				System.out.println("오잉? 공격하자~");
				
			}
			// 이 영역이 클래스다. 익명 클래스
			// extends Weapon된 클래스
			// new Weapon()은 익명클래스의 생성자를 call하는 표현식
		};
		
		useWeapon(w1);
		
	}
	
	//Weapon type의 참조값을 전달 받아서 사용하는 static 메소드
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
		w.attack();
	}
}
