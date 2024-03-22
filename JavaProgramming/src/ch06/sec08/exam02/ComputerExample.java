package ch06.sec08.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer myCom = new Computer();

		int[] arr1 = { 10, 20, 30 };
		int result1 = myCom.sum1(arr1);
		System.out.println("result1:" + result1);

		int result2 = myCom.sum1(new int[] { 10, 20, 30 });
		System.out.println("result2:" + result2);

		int result3 = myCom.sum2(10, 20, 30);
		System.out.println("result3:" + result3);
		/*
		 * int result3 = myCom.sum1(10, 20, 30); System.out.println("result3:" +
		 * result3);
		 */

		int[] arr2 = { 10, 20, 30 };
		int result4 = myCom.sum2(arr1);
		System.out.println("result4:" + result4);

		int result5 = myCom.sum2(new int[] { 10, 20, 30 });
		System.out.println("result5:" + result5);

		int result6 = myCom.sum2(10, 20, 30);
		System.out.println("result6:" + result6);
	}

}
