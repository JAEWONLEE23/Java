package MYST.ex05;

public class MeasureRunTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time1 = System.nanoTime();
		int sum = 0;
		for (int i = 1; i <= 1000000; i++) {
			sum += i;
		}
		long time2 = System.nanoTime();

		System.out.println("1~100000 p:" + sum);
		System.out.println("R" + (time2 - time1) + "bye");
	}

}
