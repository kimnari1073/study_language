package dy1111;

public class StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person per1 = new Person();
		per1.name = "아무개";
		per1.addr = "인천";
		per1.phone = "010-0000-0000";
		System.out.println("1번");
		System.out.println("이름: "+per1.name +" 주소: " + per1.addr + " 전화번호: " +per1.phone);
		
		Student stu1 = new Student();
		stu1.name = "김나리";
		stu1.addr = "서울";
		stu1.phone = "010-1111-1111";
		stu1.stuld = 20222258;
		stu1.jeongong = "컴퓨터소프트웨어공학과";
		System.out.println("2번");
		stu1.showStudent();
		

	}

}
