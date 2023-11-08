package test.frame03;

import java.awt.FlowLayout;
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
		
		this.setTitle("나의 프레임2");
		this.setBounds(100,100,500,500);// ui 객체 생성 초기위치
		
		//MyFrame의 x버튼(close 버튼)을 누르면 프로세스도 같이 종료됨
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		new FlowLayout();
		//FlowLayout 매니저 사용해보기
		setLayout(new FlowLayout());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn1=new JButton("버튼1");
		add(btn1); //프레임에 버튼 추가하기
		JButton btn2=new JButton("버튼2");
		add(btn2); //프레임에 버튼 추가하기
		JButton btn3=new JButton("버튼3");
		add(btn3); //프레임에 버튼 추가하기
		
		// 화면상에서 보이게 만듬
		setVisible(true);
	}

	public static void main(String[] args) {
		//MyFrame 객체 생성
		new MyFrame();// ui 객체 호출
		System.out.println("main 메소드가 종료됩니다.");
	}
	
}
