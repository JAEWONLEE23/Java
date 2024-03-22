package ch06.sec06.exam02;

public class Car {
	//필드 선언(객체에 포함되는 데이터 선언)
	String company = "현대자동차";
	String model;
	String color;
	int speed;
	int maxspeed = 350;
   //생성자 선언
	Car() {
		model = "그랜져";
		color = "검정";	

	}
	//메소드 선언
	void run() {
		speed = 60;
		
	}
}
