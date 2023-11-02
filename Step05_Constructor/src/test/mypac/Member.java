package test.mypac;
/**중요한 내용
 * 
 */
public class Member {
	//필드
	public int num;
	public String name;
	public String addr;
	
	// public Member 생성전까지는
	// 여기엔 default 생성자가 있는 상황
	
	// 밑에 코드를 생성하면 MainClass02의 Member m1=new Member(); 코드는 에러발생
	// 매개변수 = 지역변수
	public Member(int num, String name, String addr){
		
		// 매개변수를 heap 영역의 필드 영역으로 저장하기 위해
		this.num = num;
		this.name = name;
		this.addr = addr;
	}
	
	// 메소드 오버로딩 : 다중정의 가능
	public Member() {}
	
	//메소드
	public void printInfo() {
		System.out.println("번호: "+num+" 이름: "+name+" 주소: "+addr);
	}
}
