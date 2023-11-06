package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.AuthorDto;
import test.mypac.MemberDto;

/*
 * 글 목록을 ArrayList 에 담아보세요
 * 
 * 글 하나는 글번호, 작성자, 제목으로 이루어져 있다고 가정합니다.
 * 
 * 글 3개의 정보를 ArrayList 에 담고, 반복문 돌면서 담긴 내용을 출력해보세요.
 * 
 * 글하나를 담을 dto 클래스를 알아서 만들어 보세요.(클래스명, 필드명)
 */
public class QuizMain2 {
	public static void main(String[] args) {
		
		List<AuthorDto> authorDto = new ArrayList<>();
		
		AuthorDto storyBooks1 = new AuthorDto(1, "김구라", "진실의 방");
		AuthorDto storyBooks2 = new AuthorDto(2, "해골", "부산역");
		AuthorDto storyBooks3 = new AuthorDto(3, "원숭이", "나무에서 떨어진 날");
		
		authorDto.add(storyBooks1);
		authorDto.add(storyBooks2);
		authorDto.add(storyBooks3);
		
		for(AuthorDto tmp: authorDto) {
			String result=String.format("번호: %d, 작성자: %s, 제목: %s", 
					tmp.getNum(), tmp.getAuthor(), tmp.getTitle());
			System.out.println(result);
		}
	}
}
