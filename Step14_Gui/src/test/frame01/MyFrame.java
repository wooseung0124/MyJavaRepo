package test.frame01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Gui 관련 내용을 배워보자.
 */
public class MyFrame extends JFrame{ //JFrame는 잘 사용하지 않음, 학습용으로 좋음
	
	//생성자
	public MyFrame() {
		
		this.setTitle("나의 프레임");
		this.setBounds(100,100,500,500);// ui 객체 생성 초기위치
		
		//MyFrame의 x버튼(close 버튼)을 누르면 프로세스도 같이 종료됨
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//상속된 메소드는 본인것처럼 사용가능함, this 생략가능
		
		// 레이아웃 매니저(x,y의 절대좌표)는 아직 사용하지 않겠다.
		setLayout(null);
		// 버튼 하나를 만들어서
		JButton btn1 = new JButton("버튼1");
		// 위치를 설정하고(x,y)
		btn1.setLocation(10, 10);
		// 크기도 설정하고(width, height)
		btn1.setSize(100,30);
		// 프레임에 추가하기
		add(btn1);
		// 버튼에 등록할 액션리스너 객체의 참조값을 얻어내서 listener 지역변수에 참조값을 담기
		ActionListener listener=new ActionListener() {
			
			@Override //실행될 경우
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 눌렀군");
				//알림창 띄우기(띄울 프레임의 참조값, 띄울 문자열)
				JOptionPane.showMessageDialog(MyFrame.this, "버튼을 눌렀군 짜식");
			}
		};
		
		//버튼에 액션 리스너 등록하기
		btn1.addActionListener(listener);
		
		JButton btn2 = new JButton("버튼2");
		btn2.setLocation(120, 10);
		btn2.setSize(100,30);
		add(btn2);
		
		btn2.addActionListener((e)->{
			JOptionPane.showMessageDialog(MyFrame.this, "버튼2도 눌렀어?");
		});
		
		// 화면상에서 보이게 만듬
		setVisible(true);
	}

	public static void main(String[] args) {
		//MyFrame 객체 생성
		new MyFrame();// ui 객체 호출
		System.out.println("main 메소드가 종료됩니다.");
	}
	
}
