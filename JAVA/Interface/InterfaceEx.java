package dy1118;

public class InterfaceEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamsungPhone s1 = new SamsungPhone("010-1111-1111");
		s1.sendCall();
		s1.receiveCall();
		IPhone i1 = new IPhone("010-2222-2222");
		i1.sendCall();
		i1.receiveCall();
		
	}

}
