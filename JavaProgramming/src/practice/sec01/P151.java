package practice.sec01;

import java.util.Scanner;

public class P151 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = new int[3];
		Scanner sc = new Scanner(System.in);

		int num = 0;

		
		for (int i = 0; i < intArray.length; i++) {
			num = sc.nextInt();

			intArray[i] = num;
		}
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);

			
		}
	}

}
