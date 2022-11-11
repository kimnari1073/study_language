package dy1111;

public class Customer extends Person {
	int cusNo;
	int mile;
	
	public Customer() {}
	
	public void printCust() {
		System.out.println("고객번호: " +this.cusNo + "|이름: " + this.name + "|마일리지: " + this.mile+"|주소: "+this.addr + "|전화번호: "+this.phone);
	}
}
