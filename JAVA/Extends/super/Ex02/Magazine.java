package dy1111;

public class Magazine extends Book {
	String date;
	
	public Magazine() {}
	public Magazine(String title, int pages, String author, String date) {
		super(title,pages,author); //꼭 첫번째 줄에 와야함.
		this.date = date;
	}
	public void showMagazine() {
		System.out.println("--잡지--");
		System.out.println("제목: " + this.title +"|페이지수: "+ this.pages+"|저자: "+this.author);
		System.out.println("발행일: " + this.date);
	}
}
