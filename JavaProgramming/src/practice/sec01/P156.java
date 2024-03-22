package practice.sec01;

public class P156 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = "lee";
		String strVar2 = "lee";

		if (strVar1 == strVar2) {
			System.out.println("strVar1 과 strVar2 참조가 같다");
		} else {
			System.out.println("strVar1 과 strVar2 참조가 다르다");
		}
		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1 과 strVar2은 문자열이 같다.");
		}

		String strVar3 = "jae";
		String strVar4 = "jae";

		if (strVar3 == strVar4) {
			System.out.println("strVar3 과 strVar4 참조가 같다");
		} else {
			System.out.println("strVar3 과 strVar4 참조가 다르다");
		}

		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3 과 strVar4 문자열이 동일하다");
		}

	}

}
