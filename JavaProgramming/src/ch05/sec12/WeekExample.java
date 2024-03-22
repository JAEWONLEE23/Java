package ch05.sec12;

import java.util.Calendar;

public class WeekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today = null;// 참조타입 null대입가능

		Calendar now = Calendar.getInstance();
		int week = now.get(Calendar.DAY_OF_WEEK) +1;

		switch (week) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break;
		case 4: today = Week.WENESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;

		}
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 자바 공부를 합니다.");
		} else {
			System.out.println("열심히 자바 공부를 합니다.");
		}
	}
	
	

}
