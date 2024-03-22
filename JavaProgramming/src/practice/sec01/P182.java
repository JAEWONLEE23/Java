package practice.sec01;

public class P182 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] MathScores = new int[2][3];

		for (int i = 0; i < MathScores.length; i++) {
			for (int k = 0; k < MathScores[i].length; k++) {
				System.out.println("MathScores:[" + i + "][" + k + "]:" + MathScores[i][k]);

			}
			System.out.println();
		}
		MathScores[0][0] = 80;
		MathScores[0][1] = 83;
		MathScores[0][2] = 85;
		MathScores[1][0] = 90;
		MathScores[1][1] = 93;

		int totalSd = 0;
		int totalMs = 0;
		for (int i = 0; i < MathScores.length; i++) {
			totalSd += MathScores[i].length;
			for (int k = 0; k < MathScores[i].length; k++) {

				totalMs += MathScores[i][k];

			}

		}
		double totalavg = (double) totalMs / totalSd;
		System.out.println("전체학생 의 수학 평균 점수:" + totalavg);
		System.out.println();

		int[][] EnglishScores = new int[2][];
		EnglishScores[0] = new int[2];
		EnglishScores[1] = new int[3];

		for (int i = 0; i < EnglishScores.length; i++) {
			for (int k = 0; k < EnglishScores[i].length; k++) {

				System.out.println("EnglishScores:[" + i + "][" + k + "]:" + EnglishScores[i][k]);

			}
		}
		System.out.println();

		EnglishScores[0][0] = 90;
		EnglishScores[0][1] = 91;
		EnglishScores[1][0] = 92;
		EnglishScores[1][1] = 93;
		EnglishScores[1][2] = 94;
		totalSd = 0;
		int totalEs = 0;
		for (int i = 0; i < EnglishScores.length; i++) {
			totalSd += EnglishScores[i].length;
			for (int k = 0; k < EnglishScores[i].length; k++) {
				totalEs += EnglishScores[i][k];
			}
		}
		double totalEsAvg = (double) totalEs / totalSd;
		System.out.println("전체학생의 영어 평균 점수:" + totalEsAvg);

	}
}
