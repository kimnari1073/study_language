package dy1104;

public class Book {
	//1필드
	String title;
	String author;
	//2생성자
	public Book() {}
	public Book(String title) {
		this(title,"작자미상"); //다른 생성자를 호출함
	}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	//3메소드
	void show() {
		System.out.println(title + ' ' + author);
	}
}
