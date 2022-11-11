package dy1111;

public class TextBookEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextBook tbk1 = new TextBook();
		tbk1.title = "자바";
		tbk1.pages = 750;
		tbk1.author = "황기태";
		tbk1.hakgi = "1학년2학기";
		tbk1.school = "동양미래대학교";
		tbk1.showTextBook();
		
		TextBook tbk2 = new TextBook("c언어",500,"강환수","1학년1학기","동양미래고등학교");
		tbk2.showTextBook();

	}

}
