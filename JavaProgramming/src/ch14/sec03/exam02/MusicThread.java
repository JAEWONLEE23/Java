package ch14.sec03.exam02;

public class MusicThread extends Thread {

	@Override
	public void run() {
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
