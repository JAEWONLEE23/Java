package ch14.sec07.exam03;

public class PrintThread extends Thread {
	@Override
	public void run() {
		try {
			while (true) {
				System.out.println("실행중");
				Thread.sleep(1);
				
			}

		} catch (InterruptedException e) {

		}
		System.out.println("리소스 정리");
		System.out.println("실행종료");
	}
}
