package dy1111;

public class Book {
	String title;
	int pages;
	String author;
	
	public Book() {}
	public Book(String title, int pages, String author) {
		this.title = title;
		this.pages = pages;
		this.author = author;
	}
	public void showBook() {
		System.out.println("--책--");
		System.out.println("제목: " + this.title +"|페이지수: "+ this.pages+"|저자: "+this.author);
	}
}
