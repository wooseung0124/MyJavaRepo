package test.mypac;

public class AuthorDto {

	private int num; // 글번호
	private String author; // 작성자
	private String title; // 글제목
	
	public AuthorDto() {}  // 디폴트 생성자

	public AuthorDto(int num, String author, String title) {
		super();
		this.num = num;
		this.author = author;
		this.title = title;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	};
	
	
	
	
}
