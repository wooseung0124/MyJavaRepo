package test.main;

import test.mypac.Calc;

public class MainClass05 {
	public static void main(String[] args) {
		
		Calc add1 = new Calc() {
			
			@Override
			public double execute(double num1, double num2) {
				
				return num1+num2;
			}
		};
		
		double result1 = add1.execute(10, 20);
		
		//매개변수의 type은 선언할 필요가 없다. 매개 벼수의 개수만 맞으면 됨.
		Calc add2=(num1, num2)->{
			return num1+num2;
		};
		// 중괄호 안에서 따로 실행할 code 가 없다면 중괄호 생략, return예약어 생략 후 리턴할 값만 명시하면 된다.
		Calc add3=(num1,num2)->num1+num2;//한줄짜리 함수모양 => 람다식
		
		Calc add=(a,b)->a+b;
		Calc sub=(a,b)->a-b;
		Calc mul=(a,b)->a*b;
		
		double result2 = add.execute(10, 20);
		double result3 = sub.execute(100, 100);
		double result4 = mul.execute(3, 5);
		
		
	}
}
