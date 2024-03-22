package ch14.sec05.exam02;

public class JoinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumThread sumthread = new SumThread();
		sumthread.start();

		try {
			sumthread.join();
		} catch (InterruptedException e) {

		}
		System.out.println("1~100 합:" + sumthread.getSum());
	}

}
