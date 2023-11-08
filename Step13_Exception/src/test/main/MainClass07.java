package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass07 {
	public static void main(String[] args) { 
		// File 클래스 : IO패키지(인풋,아웃풋)
		
		/*
		 * 현재 존재하거나 혹은 존재하지 않은 파일이나 폴더를 제어할 수 있는 File 객체를 생성해서
		 * 참조값을 f라는 지역변수에 담기
		 */
		File f=new File("C:/acorn202310/myFolder/memo.txt");
		
		/*
		 * File 객체의 메소드를 활용해서
		 * 실제 memo.txt 파일이 존재하지 않으면 파일을 만들고
		 * 존재하면 memo.txt 파일을 삭제하도록 프로그래밍 해보세요
		 * 
		 * 
		if(f.isFile()) {
			f.delete();
		}else {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// 지정한 링크가 잘못되었을 때
				e.printStackTrace();
			}
		}
		 */
		
		try {
			if(f.exists()) {
				f.delete();
			}else {
				f.createNewFile();
			}
		}catch(IOException e) {
			// 지정한 링크가 잘못되었을 때
			e.printStackTrace();
		}
		
	}
}
