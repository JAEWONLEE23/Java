package ch05.sec07;

public class MultidimensionalArrayByValueListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] scores = { { 80, 90, 96 }, { 76, 88 } };
		System.out.println("1차원 배열의길이" + scores.length);
		System.out.println("2차원 배열의길이(첫번째)" + scores[0].length);
		System.out.println("2차원 배열의길이(두번째)" + scores[1].length);

		System.out.println(scores[0][2]);
		System.out.println(scores[1][1]);

		int class1sum = 0;
		for (int i = 0; i < scores[0].length; i++) {
			class1sum += scores[0][i];
		}
		double class1avg = (double) class1sum / scores[0].length;
		System.out.println("첫번째 반의평균 점수" + class1avg);

		int class2sum = 0;
		for (int i = 0; i < scores[1].length; i++) {
			class2sum += scores[1][i];
		}
		double class2avg = (double) class2sum / scores[1].length;
		System.out.println("두번째 반의평균 점수" + class2avg);

		int totalStd = 0;
		int totalscore = 0;
		for (int i = 0; i < scores.length; i++) {
			totalStd += scores[i].length;

			for (int k = 0; k < scores[i].length; k++) {
				totalscore += scores[i][k];

			}

			double totalavg = (double) totalscore / totalStd;
			System.out.println("총평균" + totalavg);

		}

	}

}
