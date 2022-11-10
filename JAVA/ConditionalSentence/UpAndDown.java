package dy1110;

import java.util.Scanner;

public class UpAndDown {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int correct = (int)(Math.random()*100);
		System.out.println(correct);
		int min = 0, max = 99, count = 0, answer;
		String tem="";
		System.out.println("수를 결정하였습니다. 맞추어 보세요.");
		//번호 맞추기
		while(true) {
			count++;
			System.out.println(min + " - " + max);
			System.out.println(count + ">> ");
			answer = scanner.nextInt();
			if(answer > 99 || answer < 0) {
				System.out.println("정답 범위 밖의 수를 입력하였습니다. 다시 입력하세요.");
				continue;
			}
			else if(answer < correct) {
				System.out.println("더 높게");
				min = answer;
				continue;
			}
			else if(answer > correct) {
				System.out.println("더 낮게");
				max = answer;
				continue;
			}
			else if(answer == correct) {
				System.out.print("정답입니다. 다시하시겠습니까?(y/n)>>");
				tem = scanner.next();
				if(tem.equals("y")) {
					min = 0; max = 99; correct = (int)(Math.random()*100);count=0;
					System.out.println("수를 결정하였습니다. 맞추어보세요.");
				}
				else break;
			}
		}
		scanner.close();
	}
}
