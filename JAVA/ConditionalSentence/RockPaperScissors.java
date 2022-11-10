package dy1110;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		String pepleOne,pepleTwo, winner="";
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		System.out.print("첫 번째 사람 >> ");
		pepleOne = scanner.next();
		System.out.print("두 번째 사람 >>");
		pepleTwo = scanner.next();
		
		//승패 구분
		if(pepleOne.equals("가위")) {
			if(pepleTwo.equals("가위"))winner = "없음";
			else if(pepleTwo.equals("바위")) winner = "두 번째 사람";
			else winner = "첫 번째 사람";
		}
		else if(pepleOne.equals("바위")) {
			if(pepleTwo.equals("바위"))winner = "없음";
			else if(pepleTwo.equals("보")) winner = "두 번째 사람";
			else winner = "첫 번째 사람";
		}
		else if(pepleOne.equals("보")){
			if(pepleTwo.equals("보"))winner = "없음";
			else if(pepleTwo.equals("가위")) winner = "두 번째 사람";
			else winner = "첫 번째 사람";
		}
		System.out.println("");
		//결과 출력
		if(winner.equals("없음"))
			System.out.println("비겼습니다.");
		else
			System.out.println(winner + "가 이겼습니다.");
	}

}
