package dy1118;

public class Rect extends Shape {
	private int width;
	private int height;
	//생성자
	public Rect(){}
	public Rect(String name, int width, int height) {
		super(name);
		this.width = width;
		this.height = height;
	}
	//메서드
	@Override
	public void draw() {
		System.out.println("사각형 Rect");
	}
	@Override
	public void printArea() {
		int area = width * height;
		System.out.println("사각형의 면적 = " + area);
	}
	@Override
	public void printGili() {
		// TODO Auto-generated method stub
		int gili = width *2 + height * 2;
		System.out.println("사각형의 길이 =" + gili);
	}
}
