package ch05.sec10;

public class AdvancedforExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = { 95, 71, 84, 93, 87 };
		int sum = 0;
		for (int score : scores) {
			sum = sum + score;
		}
		System.out.println("총합:" + sum);

		double avg = (double) sum / scores.length;
		System.out.println("평균:" + avg);
	}

}
