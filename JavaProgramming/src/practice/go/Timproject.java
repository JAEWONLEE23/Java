package practice.go;

import java.util.Scanner;

public class Timproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true; //while문을 반복시키기위한 코드  ;중지시킬려면 flase                                           조건식을위한 변수를 선언
		int select = 0; //메뉴에  들어가기위한 번호를 저장시키위해 변수 생성
		Scanner sc = new Scanner(System.in); // scanner 객체생성 문자열을 키보드로 입력받기위해서 sc 변수를 선언
		int boardNm = 0; // 게시판 번호를 입력받기위한 변수 생성
		int a;//대입할수있는 변수가 필요해서 생성을 함
		int total =0; // 게시판 총 개수로 사용하는 변수
		
		String[][] board = new String[100][4];// 배열 변수 선언과 배열 생성
//		board[boardNm][0] = "";
//		board[boardNm][1] = "";
//		board[boardNm][2] = "";

		while (run) { //위에서 만든 while문 코드에서 run을 ture로 선언후에 중괄호 안을 무한히 반복하기위해 실행한다.

			System.out.println("################################################"); //출력하기위한 매뉴를 생성한후
			System.out.println("-------------------------------------");
			System.out.println("번호   제목                    글쓴이");
			System.out.println("-------------------------------------");
			for (a = total; a >= 1; a--) { // 포문을 이용하여 처음a = boardNm을 초기화 시키고 , 조건식a >= 1을 설정한후에 a--증감식을 사용하였다.
											//가장 마지막 부터 처음 까지 내림차순으로 사용하기위해 .
				System.out.println(board[a][0] + "\t" + board[a][1] + "\t\t\t" + board[a][2]);}			
							//a를 고정값으로 사용한후.0은게시판 번호 1. 제목 2 글쓴이
			System.out.println("메뉴: 1.생성 | 2.보기 | 3.수정 | 4.삭제 | 5.종료");
			System.out.println("-------------------------------------");
			System.out.println("선택:");

			select = Integer.parseInt(sc.nextLine()); //문자열 정수로 바꾸기때문에 select에 정수로 바꾸기위해서 사용한것이다.

			if (select == 1) { // if문을 생성하여 조건식을 통하여 실행문을 진행하였고. 메뉴1을입력 후 중괄호 진행
				total = total+1; // 생성 할수록 총 개수가 증가하기때문에
				boardNm = boardNm +1 ; // 처음값 0 보드 게시판 을 1을 넣기위해서 대입한것이다. 밑에를 1을 넣고 싶어서 보드넘을 영을 초기화
				board[boardNm][0] = String.valueOf(boardNm); //보드 넘버가 정수로 나와서 숫자를 스트링으로 바꿀려고 해서 써줘야된다.
				System.out.println("[새글쓰기]");
				System.out.print("제목:");
				board[boardNm][1] = sc.nextLine(); //보드넘버는 문자열이기 때문에 그값을 위해 스캐너 넥스트라인을 사용한것이다.
				                                   //그렇기 때문에  정수로 변환된 select 1을 대입후 넥스트라인 사용.
				System.out.print("글쓴이:");
				board[boardNm][2] = sc.nextLine(); 
				System.out.print("내용:");
				board[boardNm][3] = sc.nextLine();

			} else if (select == 2) { // 보기
				
				System.out.print("게시물 번호");
				boardNm = Integer.parseInt(sc.nextLine());

				System.out.println("[글보기]");
				System.out.println("번호" + board[boardNm][0]);
				System.out.println("제목" + board[boardNm][1]);
				System.out.println("글쓴이" + board[boardNm][2]);
				System.out.println("내용" + board[boardNm][3]);

			} else if (select == 3) { // 수정
				
				System.out.print("게시물 번호");
				boardNm = Integer.parseInt(sc.nextLine());
				
				System.out.println("[글수정]");
				System.out.print("제목:");
				board[boardNm][1] = sc.nextLine();
				System.out.print("내용:");
				board[boardNm][3] = sc.nextLine();

			} else if (select == 4) { // 삭제

				System.out.print("게시물 번호");
				boardNm = Integer.parseInt(sc.nextLine());

				for (int i = 0; i < 4; i++) { //for문을 사용하여 중괄호를 4번 반복하여 실행하였으며 
					board[boardNm][i] = null; //뒤에만 바기뀌때문에 위에서 0123으로 i값이 1씩 증가하고 이값이 null로 바뀌기 때문 
				}

			} else if (select == 5) { 
				System.out.println("프로그램 종료");
				run = false; //while 문의 조건식을 false로 진행을 한것은 프로그램 종료시키위해 run에 flase값을 넣어 종료시켰다.

			}
		}
	}
}
