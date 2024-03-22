package practice.sec01;

public class P158 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "9506241230123";
		char sex = str.charAt(12);
		switch (sex) {
		case '1':
		case '2':
			System.out.println("남자입니다.");
			break;
		case '3':
		case '4':
			System.out.println("여자입니다.");
			break;

		}
	}

}
