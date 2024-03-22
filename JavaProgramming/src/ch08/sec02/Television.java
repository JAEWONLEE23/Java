package ch08.sec02;

public class Television implements RemoteControl { // 추상메소드에 맞게 재정의 해줘야된다.

	@Override
	public void turnOn() {

		System.out.println("tv를 켭니다.");
	}

	@Override
	public void turnOff() {

		System.out.println("tv를 끕니다.");
	}

}
