package ch05.sec07;

public class MultidimensionalArrayByValueNewExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mathScores = new int[2][3];

		for (int i = 0; i < mathScores.length; i++) {
			for (int k = 0; k < mathScores[i].length; k++) {
				System.out.println("mathScores[" + i + "][" + k + "]: " + mathScores[i][k]);
			}
		}
		System.out.println();
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;

		int totalStd = 0;
		int totalMsm = 0;
		for (int i = 0; i < mathScores.length; i++) {
			totalStd += mathScores[i].length;
			for (int k = 0; k < mathScores[i].length; k++) {

				totalMsm += mathScores[i][k];
			}
		}
		double totalMathavg = (double) totalMsm / totalStd;
		System.out.println("전체 학생의 수학 평균 점수:" + totalMathavg);
		System.out.println();

		int[][] engilshScores = new int[2][];
		engilshScores[0] = new int[2];
		engilshScores[1] = new int[3];

		for (int i = 0; i < engilshScores.length; i++) {
			for (int k = 0; k < engilshScores[i].length; k++) {
				System.out.println("engilshSc[" + i + "][" + k + "]:" + engilshScores[i][k]);
			}
		}
		System.out.println();
		
		engilshScores[0][0] = 90;
		engilshScores[0][1] = 91;
		engilshScores[1][0] = 92;
		engilshScores[1][1] = 93;
		engilshScores[1][2] = 94;

		totalStd = 0;
		int totalengilshSum = 0;
		for (int i = 0; i < engilshScores.length; i++) {
			totalStd += engilshScores[i].length;
			for (int k = 0; k < engilshScores[i].length; k++) {
				totalengilshSum += engilshScores[i][k];

			}
		}
		double totalavg = (double) totalengilshSum / totalStd;
		System.out.println("전체 학생의 영어 평균 점수:" + totalavg);

	}

}
