package abstractEx;


class Circle extends Shape{
	//1필드
	private int radius;
	//2생성자
	public Circle() {	}
	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}
	//3메소드
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원 Circle");
	}
	@Override
	public void printArea() {
		// TODO Auto-generated method stub
		double area = 3.14 * radius * radius;
		System.out.println("원의 면적 : " + radius);
	}
	@Override
	public void printGili() {
		// TODO Auto-generated method stub
		double gili = 2 *radius* 3.14;
		System.out.println("원의 지름 : " +gili);
	}
	
}
public class MethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect rect1 = new Rect("Tv", 65, 40);
		rect1.draw();
		rect1.printArea();
		rect1.printGili();
		
		Rect rect2 = new Rect("책상",90,30);
		rect2.draw();
		rect2.printArea();
		rect2.printGili();
		
		Circle cir1 = new Circle("시계", 2);
		cir1.draw();
		cir1.printArea();
		cir1.printGili();
		
		Circle cir2 = new Circle("불고기피자", 10);
		cir2.draw();
		cir2.printArea();
		cir2.printGili();
		
		Circle cir3 = new Circle("도넛", 1);
		cir3.draw();
		cir3.printArea();
		cir3.printGili();
		int count = Shape.count;
		
		System.out.println("만들어진 도형수 = "+count);

	}

}