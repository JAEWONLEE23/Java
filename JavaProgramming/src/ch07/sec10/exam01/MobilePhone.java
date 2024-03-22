package ch07.sec10.exam01;

public abstract class MobilePhone {// abstract는 추상클래스 라는것을 알려주기위해 붙여준다. 단지 공통된것들
	public String owner;

	public MobilePhone(String owner) {
		this.owner = owner;
	}

	public void turnOn() {
		System.out.println("폰전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("폰전원을 끕니다.");
	}

	public abstract void internetSearch();// 공통적인 메소드가 맞으나 실행내용이 다르기 때문에 어떤 브라우저를 사용결정을 못할때 작성을 하지 말고 추상클래스로 만들어라
											// 실행내용을 결정할수가 없는것이 추상메소드(abstract)이다.
											// 추상 메소드는 반드시 추상클래스 안에서만 존재한다.
}
