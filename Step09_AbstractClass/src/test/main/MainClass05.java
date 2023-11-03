package test.main;

import test.mypac.Weapon;

// 별도의 파일없이 내부클래스로 정의 후 사용하기
public class MainClass05 {

	static class SeaWeapon extends Weapon{

		@Override
		public void attack() {
			System.out.println("바다에 있는 적 공격공격");
		}
		
	} // SeaWeapon
	
	public static void main(String[] args) {
		Weapon w1 = new SeaWeapon();
		w1.prepare();
		w1.attack();
		
		//우주를 공격하는 무기를 만들어서 아용하고 싶다.
		class SpaceWeapon extends Weapon{

			@Override
			public void attack() {
				System.out.println("우주에 있는 적들을 공격공격");
			}
		}
		Weapon w2 = new SpaceWeapon();
		w2.prepare();
		w2.attack();
	}
}
