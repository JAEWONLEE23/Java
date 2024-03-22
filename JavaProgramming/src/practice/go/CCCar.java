package practice.go;

public class CCCar {

	String company = "현대자동차";
	String model;
	int maxspeed;
	int speed;
	String color;

	CCCar() {
	}

	CCCar(String model) {
		this.model = model;
	}

	CCCar(String model, int maxspeed) {
		this.model = model;
		this.maxspeed = maxspeed;
	}

	CCCar(String model, int maxspeed, int speed) {
		this.model = model;
		this.maxspeed = maxspeed;
		this.speed = speed;
	}

	CCCar(String model, int maxspeed, int speed, String color) {
		this.model = model;
		this.maxspeed = maxspeed;
		this.speed = speed;
		this.color = color;
	}
}
