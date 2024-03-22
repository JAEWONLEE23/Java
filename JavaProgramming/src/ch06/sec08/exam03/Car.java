package ch06.sec08.exam03;

public class Car {

	// 필드선언
	int gas;

	// 생성자(constructor) 선언

	// 메소드 선언
	void setGas(int gas) {
		this.gas = gas;

	}

	boolean isLeftGas() { // 매게변수가 없다.
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;

		}
		System.out.println("gas가 있습니다.");
		return true;
	}

	void run() {// 리턴값이 없다. //메소드는 사용가능
		while (true) { // 조건식이 true이면 계속 반복된다.
			if (gas > 0) {
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.");
				// break;
				return; // 메소드를 종료 시켜버림 / break 는 while문을 종료시킴
			}
		}
		// System.out.println("run()메소드 실행 종료");
	}
}
