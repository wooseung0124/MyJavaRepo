package test.main;

import test.mypac.Apple;
import test.mypac.FruitBox;
import test.mypac.Melon;
import test.mypac.Orange;

public class MainClass01 {
	public static void main(String[] args) {
		//box,box2,box3에 .을 찍어서 차이점 확인
		FruitBox<Apple> box = new FruitBox<Apple>();
		
		FruitBox<Orange> box2 = new FruitBox<Orange>();
		
		FruitBox<Melon> box3 = new FruitBox<Melon>();
		
		
	}
}
