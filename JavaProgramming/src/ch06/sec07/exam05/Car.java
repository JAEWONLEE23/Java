package ch06.sec07.exam05;

public class Car {

	// 필드선언
	String company = "현대자동차";
	String modle;
	String color;
	int maxspeed;

	Car(String modle) {
		this(modle, "은색", 250);
	}

	Car(String modle, String color) {
		this(modle, "은색", 250);

	}

	Car(String modle, String color, int maxspeed) {
		this.modle = modle;
		this.color = color;
		this.maxspeed = maxspeed;

	}
}
