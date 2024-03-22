package ch06.sec10.exam03;

public class Car {
	int speed; // 인스턴스 필드

	void run() { // 인스턴스 메소드 선언
		System.out.println(speed + "으로 달립니다.");

	}

	static void simulate() {
		// 객체 생성
		Car mycar = new Car();
		// 인스턴스 맴버 사용
		mycar.speed = 200;
		mycar.run();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정적 메소드 호출
		simulate();
		// 객체 생성
		Car mycar = new Car();
		// 인스턴스 맴버 사용
		mycar.speed = 60;
		mycar.run();

	}

}
