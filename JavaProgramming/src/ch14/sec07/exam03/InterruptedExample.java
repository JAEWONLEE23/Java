package ch14.sec07.exam03;

public class InterruptedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new PrintThread();
		thread.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}
		thread.interrupt();
	}

}
