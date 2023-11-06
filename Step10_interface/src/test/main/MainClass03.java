package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	public static void main(String[] args) {
		Remocon r1 = new Remocon() {

			@Override
			public void up() {
				System.out.println("볼륨up");
				
			}

			@Override
			public void down() {
				System.out.println("볼륨down");
				
			}

		};
		
		useRemocon(r1);
		
		useRemocon(new Remocon() {
			
			@Override
			public void up() {
				
				System.out.println("어어어업");
			}
			
			@Override
			public void down() {
				
				System.out.println("다아아아아운");
			}
		});
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
	
}
