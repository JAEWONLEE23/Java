package ch06.sec08.exam02;

public class CallByValueVsCallByReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value1 = 1; // 기본타입 = 값이 저장 : 다른변수에 들어갈때 값복사가 된다.
		int[] value2 = { 1 }; // 참조타입= 배열의 번지저장 : 번지복사가 된다.
		String str1 = "a"; // 불변객체 = 자기자신을 바꾸지 않는다.

		callByValue(value1);
		System.out.println("value1:" + value1);

		callByReference(value2);
		System.out.println("value2[0]:" + value2[0]);

		Member member = new Member("홍길동"); //참조타입
		System.out.println("name:" + member.name);
		callByReference(member); //감자바가 나오게됨. 번지(바뀐값이 메소드 호출에 의해 달라진다.)
		System.out.println("name:" + member.name);
	}

	public static void callByValue(int arg) { // 값으로 전달
		arg = 2;
	}

	public static void callByReference(int[] arg) { // 번지로 전달
		arg[0] = 2;

	}

	public static void callByReference(Member arg) {
		arg.name = "감자바";
	}

}
