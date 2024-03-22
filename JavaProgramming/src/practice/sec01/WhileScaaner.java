package practice.sec01;

import java.util.Scanner;

public class WhileScaaner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean cash = true;
		int sum = 0;
		int money = 0;

		while (cash) {
			System.out.println("-------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-------------------------");
			System.out.print("선택 >");

			String strNum = scanner.nextLine();

			if (strNum.equals("1")) {
				System.out.println("예금액>");
				money = Integer.parseInt(scanner.nextLine());
				sum += money;

			} else if (strNum.equals("2")) {
				System.out.println("출금액");
				money = Integer.parseInt(scanner.nextLine());
				sum -= money;

			} else if (strNum.equals("3")) {
				System.out.println("잔고" + sum);

			} else if (strNum.equals("4")) {
				System.out.println("종료합니다.");
				break;
			}
		}

	}

}
