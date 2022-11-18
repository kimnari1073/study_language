package dy1118;

class Weapon {
	//2생성자
	public Weapon() {}
	//3메소드
	protected int fire() {
		return 1;
	}
}
class Cannon extends Weapon {
	//2생성자
	public Cannon() {}
	//3메소드
	@Override
	protected int fire() {
		// TODO Auto-generated method stub
		return 10;
	}
}
public class Overriding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weapon weapon = new Weapon();
		System.out.println("기본 무기의 살상 능력은" +weapon.fire());
		
		weapon = new Cannon();
		System.out.println("대포의 살상 능력은" + weapon.fire());
	}

}
