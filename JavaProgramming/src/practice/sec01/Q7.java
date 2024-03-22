package practice.sec01;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,5,3,8,2};
		
		int max = array[0] ; 
		for (int i = 1; i<array.length; i++) {
			if (array[i]>max) {
				max = array[i];
			}
		}
		System.out.println(max);
	}

}
