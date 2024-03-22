package ch12.sec08;

import java.util.Calendar;
import java.util.TimeZone;

public class LosAngelesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeZone timeZone = TimeZone.getTimeZone("Africa/Bamako");
		Calendar now = Calendar.getInstance(timeZone);

		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if (amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		int hour = now.get(Calendar.HOUR);
		int mintue = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);

		System.out.print(strAmPm + " ");
		System.out.print(hour + "시");
		System.out.print(mintue + "분");
		System.out.println(second + "초");
	}

}
