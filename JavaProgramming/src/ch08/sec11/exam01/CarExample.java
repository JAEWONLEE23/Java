package ch08.sec11.exam01;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar = new Car(); // 자동차 객체 생성

		mycar.run(); // 자동차를 달리게 합니다.

		mycar.tire1 = new KumhoTire();
		mycar.tire2 = new KumhoTire();

		mycar.run();
	}

}
