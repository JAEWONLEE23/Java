package ch07.sec02;

public class Phone {

	public String model;
	public String color;

	public Phone() {
		System.out.println("Phone 생성자 실행");
	}

	public void bell() {
		System.out.println("벨이 울립니다.");

	}

	public void sendVoice(String message) {
		System.out.println("자기:" + message);

	}

	public void receiveVoice(String message) {
		System.out.println("상대방:" + message);
	}

	public void hangup() {
		System.out.println("전화를 끊습니다.");
	}
}
