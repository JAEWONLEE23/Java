package ch14.sec06.exam01;

public class User1Thread extends Thread {
	private Calculator calcualtor;

	public User1Thread() {
		setName("User1Thread");
	}

	public void setCalculator(Calculator calculator) {
		this.calcualtor = calculator;
	}

	@Override
	public void run() {
		calcualtor.setMemory1(100);
	}
}
