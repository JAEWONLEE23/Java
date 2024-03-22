package practice.sec01;

public class P148 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1;
		int[] arr2;
		int[] arr3;

		arr1 = new int[] { 12, 13, 14 };
		arr2 = new int[] { 12, 13, 14 };
		arr3 = arr2;

		System.out.println(arr1 != arr2);

		System.out.println(arr2 == arr3);

	}

}
