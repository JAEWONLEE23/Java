package practice.G11;

public class ExpceptionHandlingExample {
	public static void printLength(String data) {
		int result = data.length();
		System.out.println("문자수:" + result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[프로그램 시작]\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("[프로그램 종료]");
	}

}
