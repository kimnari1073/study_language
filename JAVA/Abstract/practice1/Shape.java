package abstractEx;
//설계도
abstract public class Shape {
	//1필드
	private String name;
	static int count;
	//2생성자
	public Shape() {count++;}
	public Shape(String name) {
		this.name = name;
		count++;
	}
	//3메소드
	abstract public void draw();
	abstract public void printArea();
	abstract public void printGili();
}
class Rect extends Shape{
	//1필드
	private int width;
	private int height;
	//2생성자
	public Rect(){}
	public Rect(String name, int width, int height) {
		super(name);
		this.width = width;
		this.height = height;
	}
	//3메소드
	@Override
	public void draw() {
		System.out.println("사각형Rect");
	}
	@Override
	public void printArea() {
		int area = width * height;
		System.out.println("사각형의 면적 : " + area);
	}
	@Override
	public void printGili() {
		// TODO Auto-generated method stub
		int gili = (width+height)*2;
		System.out.println("사각형의 둘레 :" + gili);
	}
}
