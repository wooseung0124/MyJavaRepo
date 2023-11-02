package test.mypac;

/*
 * Member 객체 하나에 회원의 번호, 이름, 주소를 담기 위해 Member 클래스를 설계 하려고 한다.
 */

public class Member {

	public int num;
	public String name;
	public String added;
	
	// 이 상태로 new Member(). ~ 사용하는 경우 heap영역 내에 내부값은 각각 0,null,null로 초기화됨
	// public 을 붙이면 다른 패키지에 있는 클래스에서도 사용가능
	// 다른 패키지의 클래스 내에서 사용하려면 = 대입 연산자 작성 후 오른쪽에 new Member(); 하면 됨
	
	public void showInfo() {
		// this는 나의(바로 이 객체)참조값을 가리킨다. this. 은 생략가능함
		String info="번호는 "+this.num+"이고 이름은 "+this.name+"이고 주소는"+this.added+"입니다.";
		System.out.println(info);
	}
	// this는 heap 영역에 지정된 id 값을 말한다. 설계과정에서는 몇 인지 알 수 없다.
	
	Member a = this;
}
