package ch14.sec03.exam01;

public class MusicTask implements Runnable {// runnable 작업객체를 구현시킨다.

	@Override
	public void run() {// 재정의 해야된다.
		for (int i = 0; i < 5; i++) {
			// 스레드가 작업할 내용
			System.out.println("노래를 재생합니다.");

			// 1초간 일시정지
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();// 예외의 정보를 출력
			}
		}
	}

}
