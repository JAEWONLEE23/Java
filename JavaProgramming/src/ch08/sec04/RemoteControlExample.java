package ch08.sec04;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 인터페이스 변수 선언
		RemoteControl rc = new Television();
		// 인터페이스 사용할 객체 연결
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();

		RemoteControl ad = new Audio();

		ad.turnOn();
		ad.setVolume(5);
		ad.turnOff();

		use(new Television());
		use(new Audio());
	}

	public static void use(RemoteControl rc) {// 다향성
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();

	}

}
