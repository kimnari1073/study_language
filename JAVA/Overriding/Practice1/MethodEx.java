package dy1118;
class Circle extends Shape{
	private int radius;
	
	public Circle() {	}
	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그려요..");
	}
	@Override
	public void printArea() {
		// TODO Auto-generated method stub
		double area = 3.14 * radius * radius;
		System.out.println("원의 면적 = " + radius);
	}
	@Override
	public void printGili() {
		// TODO Auto-generated method stub
		double gili = 2 *radius* 3.14;
		System.out.println("원의 지름길이  = " +gili);
	}
	
}
public class MethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape sh1 = new Shape("도형");
		sh1.draw();
		sh1.printArea();
		sh1.printGili();
		
		Rect rect1 = new Rect("Tv", 65, 40);
		rect1.draw();
		rect1.printArea();
		rect1.printGili();
		
		Circle cir1 = new Circle("축구공", 2);
		cir1.draw();
		cir1.printArea();
		cir1.printGili();
		

	}

}
