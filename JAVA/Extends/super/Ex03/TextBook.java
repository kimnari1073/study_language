package dy1111;

public class TextBook extends Book {
	String hakgi;
	String school;
	
	public TextBook() {}
	public TextBook(String title,int pages,String author, String hakgi, String school) {
		super(title,pages,author);
		this.hakgi = hakgi;
		this.school = school;
	}
	
	public void showTextBook() {
		System.out.println("--교과서--");
		System.out.println("제목: " + this.title +"|페이지수: "+ this.pages+"|저자: "+this.author);
		System.out.println("학년학기: " + this.hakgi + "|학교: " + this.school);
	}
}
