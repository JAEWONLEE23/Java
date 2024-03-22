package ch08.sec02;

public class RemoteContorlExample {

	public static void main(String[] args) {
		// 리모컨 변수 선언 = RemoteControl rc;
		RemoteControl rc = new Television();

		rc.turnOn(); // 리모콘을 통해서 TV의 전원을 켬.
		rc.turnOff();// 리모콘을 통해서 TV의 전원을 끔.

		RemoteControl ad = new Audio();

		ad.turnOn();
		ad.turnOff();

		use(new Television());
		use(new Audio());
	}

	public static void use(RemoteControl rc) {//RemoteControl rc 인터페이스로 사용가능한 객체가 온다 구현 객체가 대입될수있다.
		rc.turnOn();
	}
}
