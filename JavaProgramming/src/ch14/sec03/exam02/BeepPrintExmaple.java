package ch14.sec03.exam02;

public class BeepPrintExmaple {

	public static void main(String[] args) {
		// 작업1-------------------------------------
		Thread thread = new MusicThread();//자식객체를 먼저생성
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
