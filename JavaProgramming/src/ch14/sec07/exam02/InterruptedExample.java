package ch14.sec07.exam02;

public class InterruptedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintThread thraed = new PrintThread();
		thraed.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}
		Thread.interrupted();
	}

}
