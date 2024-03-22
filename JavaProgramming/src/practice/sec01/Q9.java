package practice.sec01;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int stdNum = 0;
		int[] arr = new int [stdNum];
		int score = 0;
		while(true) {
			
			System.out.println("=======================================");
			System.out.println("1.학생수 2.점수 입력 3.점수리스트 4.분석 5.종료");
			System.out.println("=======================================");
			System.out.println("선택 > ");
			String cNum = sc.nextLine();
	
			if(cNum.equals("1")) {
				System.out.println("학생수 > ");
				String strNum = sc.nextLine();
				stdNum = Integer.parseInt(strNum);
				arr = new int [stdNum];
				System.out.println("학생수 : "  + stdNum);
			}
			else if(cNum.equals("2")) {
				for(int i = 0 ; i<stdNum; i++) {
					String strScore = sc.nextLine();
					score =  Integer.parseInt(strScore);
					arr[i] = score;
				}
			}
			else if(cNum.equals("3")) {
				for(int i = 0 ; i<arr.length; i++) {
					System.out.println("score["+i+"] : "+arr[i]);
				}
			}
			else if(cNum.equals("4")) {
				int max = arr[0];
				int sum = arr[0];
				for(int i = 1 ; i<arr.length; i++) {
					sum += arr[i];
					if(max < arr[i]) {
						max = arr[i];
					}
				}
				double avg = (double)sum/stdNum;
				System.out.println("최고 점수 : "+ max);
				System.out.println("평균 점수 : " + avg);
			}else if(cNum.equals("5")) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("1~5까지의 숫자를 선택해주세요.");
			}
			
		}
		
		
	}

}
