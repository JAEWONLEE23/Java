package ch14.sec03.exam01;

public class BeepPrintExmaple2 {

	public static void main(String[] args) {// main thread가 실행한다.
		// 작업1-------------------------------------

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					Thread curThread = Thread.currentThread();
					// 스레드가 작업할 내용
					System.out.println("노래를 재생합니다:" + curThread.getName());

					// 1초간 일시정지
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();// 예외의 정보를 출력
					}
				}
			}

		});// 익명 구현객체 이다.
		thread.start();
		// -----------------------------------------

		// 작업2-------------------------------------

		for (int i = 0; i < 5; i++) {
			// 스레드가 작업할 내용
			Thread curThread = Thread.currentThread();

			System.out.println("가사를 출력합니다:" + curThread.getName());

			// 1초간 일시 정지
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();// 예외의 정보를 출력
			}
		}
	}
}
