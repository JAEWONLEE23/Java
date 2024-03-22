package ch08.sec05;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 인터페이스 변수 선언
		RemoteControl rc = null;
		rc = new Television();
		// 인터페이스 사용할 객체 연결
		rc.turnOn();
		rc.setVolume(5);
		// rc.turnOff();

		// RemoteControl ad = new Audio();

		// ad.turnOn();
		// ad.setVolume(5);
		// ad.turnOff();
		rc.setMute(true); // tv에 재정의 된것
		rc.setMute(false); // tv에 재정의 된것
		rc.turnOff();
	}

}
