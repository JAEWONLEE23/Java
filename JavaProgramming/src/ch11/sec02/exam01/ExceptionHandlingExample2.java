package ch11.sec02.exam01;

public class ExceptionHandlingExample2 {
		public static void printLength(String data) {// 매개값 String 객체거나 문자열
			try {
				
			int result = data.length();
			System.out.println("문자 수:" + result);
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());//예외 발생 이유
			System.out.println("-------------------");
			System.out.println(e.toString()); //예외 종류가발생했다는 정보를 출력해준다.
			System.out.println("-------------------");
			e.printStackTrace();// 예외가 어디서 부터 발생했는지 정보를 출력
			
		} finally {
			System.out.println("마무리 실행");
		}
		}	

		public static void main(String[] args) {
			System.out.println("프로그램 시작");

			printLength("ThisIsJava");
			System.out.println();
			
			printLength(null);
			
			System.out.println("프로그램 종료");

		}
	}


