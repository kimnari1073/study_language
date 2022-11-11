package dy1111;

public class Student extends Person {
	int stuld;
	String jeongong;
	
	public Student() {}
	
	public void showStudent() {
		System.out.println("이름: "+this.name +" 주소: " + this.addr + " 전화번호: " +this.phone);
		System.out.println("학번: "+this.stuld + " 전공: " + this.jeongong);
	}
}
