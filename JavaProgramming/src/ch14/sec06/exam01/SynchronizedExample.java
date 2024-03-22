package ch14.sec06.exam01;

public class SynchronizedExample {

	public static void main(String[] args) {
		// 공유 객체 생성
		Calculator calcualtor = new Calculator();
		// 공유객체를 User1Thread에 주입
		User1Thread user1Thread = new User1Thread();
		user1Thread.setCalculator(calcualtor);
		// User1Thread가 계산기를 먼저 사용
		user1Thread.start();

		// 공유객체를 User2Thread에 주입
		User2Thread user2Thread = new User2Thread();
		user2Thread.setCalculator(calcualtor);
		// User1Thread가 계산기를 나중에 사용
		user2Thread.start();
	}

}
