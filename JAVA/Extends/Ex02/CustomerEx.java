package dy1111;

public class CustomerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cus1 = new Customer();
		cus1.name = "김냥냥";
		cus1.addr = "인천";
		cus1.phone = "010-2222-2222";
		cus1.cusNo = 1;
		cus1.mile = 1000;
		cus1.printCust();
		Customer cus2 = new Customer();
		cus2.name = "김멍멍";
		cus2.addr = "부산";
		cus2.phone = "010-3333-3333";
		cus2.cusNo = 2;
		cus2.mile = 500;
		cus2.printCust();
	}

}
