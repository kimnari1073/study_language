package dy1118;

public class Shape {
	private String name;
	//생성자
	public Shape() {
	}
	public Shape(String name) {
		this.name = name;
	}
	//매서드
	public void draw() {
		System.out.println("도형Shape");
	}
	public void printArea() {
		System.out.println("도형 면적 구하기");
	}
	public void printGili() {
		System.out.println("도형 둘의 길이 구하기");
	}

}
