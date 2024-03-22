package ch14.sec06.exam01;

public class User2Thread extends Thread {
	private Calculator calcualtor;

	public User2Thread() {
		setName("User2Thread");
	}

	public void setCalculator(Calculator calculator) {
		this.calcualtor = calculator;
	}

	@Override
	public void run() {
		calcualtor.setMemory2(50);
	}
}
