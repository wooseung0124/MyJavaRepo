package test.auto2;

import test.auto.Car;
import test.auto.Engine;

public class MiniCar extends Car{

	//상속
	public MiniCar(Engine engine) {
		super(engine);
	}

	//메소드
	public void openTrunk() {
		if(this.engine == null) {
			System.out.println("Engine이 없어서 동작이 안돼요");
			return;
		}
		System.out.println("트렁크 열기");
	}
}
