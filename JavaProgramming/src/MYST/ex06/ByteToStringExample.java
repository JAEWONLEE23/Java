package MYST.ex06;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ByteToStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "자바";
		
		try {
			byte[] arr1 = data.getBytes("UTF-8");// getBytes 메소드
			System.out.println("arr1:" + Arrays.toString(arr1));

			String recoveredData = new String(arr1, "UTF-8"); //UTF-8은 전세게 문자와 숫자를 랩핑시킨것이다. 한글 1자를 인코딩하면3byte
			System.out.println(recoveredData);

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		try {
			byte[] arr2 = data.getBytes("EUC-KR");
			System.out.println("arr2:" + Arrays.toString(arr2));
			
			String recoveredData = new String(arr2, "EUC-KR"); //EUC-KR은 영어와 한글 문자와 숫자를 랩핑시킨것이다. 한글 1자를 인코딩하면2byte
			System.out.println(recoveredData);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
				
	}

}
