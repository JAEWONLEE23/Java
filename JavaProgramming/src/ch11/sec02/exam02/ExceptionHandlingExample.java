package ch11.sec02.exam02;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String2");
			System.out.println("해당 클래스가 존재합니다.");
		} catch (ClassNotFoundException e) {//예외가 발생하지 않으면 실행하지 않는다.(일반예외)
			System.out.println("해당 클래스가 존재하지않습니다.");
		}
	}

}
