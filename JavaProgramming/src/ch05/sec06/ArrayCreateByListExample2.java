package ch05.sec06;

public class ArrayCreateByListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores;
		scores = new int[] { 83, 90, 87 };
		int sum1 = 0;
		for (int i = 0; i < 3; i++)

		{
			sum1 += scores[i];

		}
		System.out.println("총합:" + sum1);

		printItem(new int[] { 83, 90, 87 });
		System.out.println("프로그램 종료");
	}

	private static void printItem(int[] is) {
		// TODO Auto-generated method stub
		for (int i = 0; i < is.length; i++) {
			System.out.println("score[" + i + "]: " + is[i]);
		}
	}

}
