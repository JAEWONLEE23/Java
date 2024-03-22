package practice.sec01;

public class Type5Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int sum= 0;
		int total =0;
		for(int i = 0; i<array.length; i++) {
			 total += array[i].length;
			for(int k = 0; k<array[i].length; k++) {
				sum += array[i][k];
			}
			
		}
		System.out.println("전체합:" + sum);
		double avg = (double) sum / total ;
		System.out.println("총평균은:" + avg);
	}

}
