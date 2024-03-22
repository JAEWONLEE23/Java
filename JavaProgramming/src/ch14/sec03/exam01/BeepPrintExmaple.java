package ch14.sec03.exam01;

public class BeepPrintExmaple {

	public static void main(String[] args) {// main thread가 실행한다.
		// 작업1-------------------------------------
		Runnable runnable = new MusicTask();//작업객체를 먼저 생성
		Thread thread = new Thread(runnable);  //runnable은 작업객체
		thread.start();
		// -----------------------------------------

		// 작업2-------------------------------------

		for (int i = 0; i < 5; i++) {
			// 스레드가 작업할 내용
			System.out.println("가사를 출력합니다.");

			// 1초간 일시 정지
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();// 예외의 정보를 출력
			}
		}
	}
}
