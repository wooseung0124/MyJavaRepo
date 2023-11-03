package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass02 {

	public static void main(String[] args) {
		//useString메소드 호출
		MainClass02.useString("abcd");
		
		//아래의 useWeapon()메소드를 여기서 호출해보세요
		useWeapon(new MyWeapon());
		
		System.out.println("main 끝!");
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
	
	public static void useString(String msg) {
		
		System.out.println(msg+" 의 길이: "+msg.length());
	}
}
