package dy1118;

public interface PhoneInterface {
	public static final int TIMEOUT = 10000;
	
	void sendCall();
	void receiveCall();
}
class SamsungPhone implements PhoneInterface{
	//1필드
	private String phoneNo;
	//2생성자
	public SamsungPhone() {};
	public SamsungPhone(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	//3매소드
	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("삼성폰 띠리리리링");
	}
	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("삼성폰 전화가 왔습니다.");
	}
	
}
class IPhone implements PhoneInterface{
	//1필드
	private String phoneNo;
	//2생성자
	public IPhone() {};
	public IPhone(String phoneNo) {
		this.phoneNo = phoneNo;
	};
	//3메소드
	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("아이폰 띠리리리링");
	}
	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("아이폰 전화가 왔습니다.");
	}
}