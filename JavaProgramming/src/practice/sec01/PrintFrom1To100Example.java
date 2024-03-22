package practice.sec01;

public class PrintFrom1To100Example {

	public static void main(String[] args) {

		int sum = 0;

		for (int m = 1; m <= 100; m++) {
			if (m % 3 == 0)

			{
				sum = sum + m;

			}

		}

		System.out.println(sum);
	}
}