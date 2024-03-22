package practice.G11.exam01;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("java.lang.String");
			System.out.println("java.lang.String 클래스가 존재합니다.");

		} catch (ClassNotFoundException e) {
			System.out.println("존재하지 않습니다.");

		}
	}

}
