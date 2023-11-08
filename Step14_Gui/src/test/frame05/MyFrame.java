package test.frame05;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class MyFrame extends JFrame implements ActionListener{
	JButton sendBtn = null;
	JButton updateBtn = null;
	JButton deleteBtn = null;
	
	//생성자
	public MyFrame() {
		
		this.setTitle("나의 프레임");
		this.setBounds(100,100,500,500);// ui 객체 생성 초기위치
		
		//MyFrame의 x버튼(close 버튼)을 누르면 프로세스도 같이 종료됨
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JButton sendBtn=new JButton("전송");
		JButton updateBtn=new JButton("수정");
		JButton deleteBtn=new JButton("삭제");
		
		this.sendBtn = sendBtn;
		this.updateBtn = updateBtn;
		this.deleteBtn = deleteBtn;
		
		sendBtn.addActionListener(this);
		// implements ActionListener 구현선언 안할 경우
		// 그리고 오버라이드 안했을 경우 오류뜸
		updateBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		
		//this (현 객체, MyFrame 객체)의 type 다형성 확인
		Object a=this;
		JFrame b=this;
		MyFrame c=this;
		ActionListener d=this;
		
		add(sendBtn);
		add(updateBtn);
		add(deleteBtn);
				
		// 화면상에서 보이게 만듬
		setVisible(true);
		

	}

	public static void main(String[] args) {
		//MyFrame 객체 생성
		new MyFrame();// ui 객체 호출
		System.out.println("main 메소드가 시작되었습니다.");
	}

	//ActionListener 인터페이스를 implements 했기에 강제로 오버라이드 된 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		/*
		//눌러진 버튼의 액션 command 문자열을 읽어온다(기본값은 버튼 text)
		 String command=e.getActionCommand();
		// System.out.println(command);
		 
		if(command=="전송") {
			System.out.println("전송한다 짜샤");
		}else if(command=="수정") {
			System.out.println("수정한다 짜샤");
		}else if(command=="삭제") {
			System.out.println("삭제한다 짜샤");
		}
		
		 * 위와 동일한 동작을 아래의 메소드가 리턴해주는 object의 참조값(JButton의 참조값)을
		 * 활용하는 구조로 MyFrame 클래스를 수정해보세요.
		 * hint: JButton의 참조값을 필드값에 저장
		 */
		
		Object obj =e.getSource();
		
		if(this.sendBtn == obj) {
			System.out.println("전송한다 짜샤");
			
		}else if(this.updateBtn == obj) {
			System.out.println("수정한다 짜샤");
			
		}else if(this.deleteBtn == obj) {
			System.out.println("삭제한다 짜샤");
		}
		
	}
}
