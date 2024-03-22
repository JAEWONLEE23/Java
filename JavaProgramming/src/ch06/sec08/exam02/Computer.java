package ch06.sec08.exam02;

public class Computer {

	//field 선언
	
	//constructor 선언
	//Method 선언
	int sum1(int[] values) {
		int result =0;
		for(int i = 0; i<values.length; i++) {
			result += values[i];
		}
		return result;
	}

	int sum2(int...values) {//가변의 길이 매개값 갯수가 다른경우
		int result =0;
		for(int i = 0; i<values.length; i++) {
			result += values[i];
		}
		return result;
	}
	
}
