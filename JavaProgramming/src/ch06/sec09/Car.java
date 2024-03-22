package ch06.sec09;

public class Car {

	// 필드 선언
	static String company = "현대자동차";
	String model;
	int speed;

	// 생성자 선언
	Car(String model) {
		this.model = model;

	}
	// 메소드 선언
	static void info() {// info는 객체를 생성하지 않아도 사용가능
		System.out.println(company + "가 설계한 자동차"); // company는 객체가 있다. static 가능
		// this.model = "그랜져"; x but static으로는 불가능
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}

	void run() {
		setSpeed(100);
		System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");//this.를 붙이는 이유 객체가 가지고 있는 필드를 강조 때문에 붙인다.
																					//빼도 상관없음.

	}
	// 메소드 선언

}
