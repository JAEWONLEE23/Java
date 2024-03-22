package practice.sec01;

public class P163 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String suj = "자바 프로그래밍";

		int location = suj.indexOf("프로그래밍");
		System.out.println(location);

		String sub = suj.substring(location);
		System.out.println(sub);

		location = sub.indexOf("자바");
		if (location != -1) {
			System.out.println("이름이 맞는 군요.");
		} else {
			System.out.println("이름이 맞지 않군요");

		}
		boolean result = sub.contains("자바");
		if (result) {
			System.out.println("이름이 맞는 군요.");

		} else {
			System.out.println("이름이 맞지 않군요.");
		}
	}

}
