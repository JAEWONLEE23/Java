package ch12.sec09;

import java.text.DecimalFormat;

public class DecimalFromatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num = 1234567.89;

		DecimalFormat df;

		df = new DecimalFormat("\u00A4 #,###");
		System.out.println(df.format(num));

		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num));
	}

}
