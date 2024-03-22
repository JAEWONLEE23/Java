package practice.sec01;

import java.util.Scanner;

public class Type5Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean pt = true;
		int sum = 0;
		int Std = 0;
		int x = 0;
		int y = 0;
		int z = 0;
		int a = 0;
		int b = 0;
		int stdNum = 0;
		int[] scores = new int[stdNum];

		while (pt) {
			System.out.println("-----------------------------------------------");
			System.out.println(" 1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.println("선택>");

			String strNum = sc.nextLine();

			if (strNum.equals("1")) {
				System.out.println("학생수>");
				int std = Integer.parseInt(sc.nextLine()); // std학생수

			} else if (strNum.equals("2")) {
				System.out.println("scores[0] >");
				scores[0] = Integer.parseInt(sc.nextLine()); // x는 scores 0의 점수
				System.out.println("scores[1] >");
				scores[1] = Integer.parseInt(sc.nextLine()); // y는 scores 1의점수
				System.out.println("scores[2] >");
				scores[2] = Integer.parseInt(sc.nextLine()); // z는 scores 2점수

			} else if (strNum.equals("3")) {
				System.out.println("scores[0]:" + scores[0]);
				System.out.println("scores[1]:" + scores[1]);
				System.out.println("scores[2]:" + scores[2]);

			} else if (strNum.equals("4")) {
				for (int i = 0; i < scores.length; i++) {
					if (scores[0] < scores[i]) {
						scores[0] = scores[i];

					}

				}
				System.out.println("최고점수:" + scores[0]);

				double avg = (double) (x + y + z) / Std;
				System.out.println("평균점수:" + avg);

			} else if (strNum.equals("5")) {
				System.out.println("프로그램종료");
			}
		}
	}

}
