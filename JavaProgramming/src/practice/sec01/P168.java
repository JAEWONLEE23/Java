package practice.sec01;

public class P168 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] reason = { "Spring", "Summer", "Fall", "winter" };

		System.out.println("reason[0]:" + reason[0]);
		System.out.println("resaon[1]:" + reason[1]);
		System.out.println("resaon[2]:" + reason[2]);
		System.out.println("resaon[3]:" + reason[3]);

		reason[1] = "여름";
		System.out.println("resaon[1]:" + reason[1]);
		System.out.println();

		int[] scores = { 80, 90, 87 };
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
			
		}
		System.out.println("총합:" + sum);
		double avg = (double) sum / 3;
		System.out.println("평균:" + avg);
	}

}
