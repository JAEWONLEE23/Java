package ch14.sec05.exam02;

public class SumThread extends Thread {
	// field
	private long sum;

	// constructor

	// method
	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
	}
}
