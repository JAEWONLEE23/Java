package practice.sec01;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{95,86},
				{83,92,96},
				{78,83,93,87,88},};
		int sum = 0;
		int totalcnt = 0;
		for (int i = 0; i< arr.length; i++) {
				totalcnt += arr[i].length;
			for(int j = 0; j<arr[i].length; j++) {
				sum += arr[i][j];
				
			}
		}
		System.out.println("총 합 : " + sum);
		double avg = (double)sum/totalcnt;
		System.out.println(avg);
		
	}

}
