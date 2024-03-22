package practice.G11;

public class ExpceptionHandlingExample1 {
	public static void printLength(String data) {
		try {
			int result = data.length();
			System.out.println("믄자수:" + result);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("마무리실행");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[프로그램시작합니다]\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("[프로그램을 종료합니다.]");
	}

}
