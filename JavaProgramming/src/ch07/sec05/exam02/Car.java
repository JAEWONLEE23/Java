package ch07.sec05.exam02;

public class Car {
	// 필드선언
	public int speed;

	// 생성자 선언
	// 메소드 선언
	public void speedup() {
		speed += 1;
	}

	public final void stop() {
		speed = 0;
	}
}
