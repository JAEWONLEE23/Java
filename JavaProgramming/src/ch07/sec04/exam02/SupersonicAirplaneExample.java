package ch07.sec04.exam02;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupersonicAirplane spa = new SupersonicAirplane(); //자식객체
		spa.takeOff();

		spa.fly(); 

		spa.flyMode = FlyMode.SUPERSONIC;
		spa.fly();
		
		spa.flyMode = FlyMode.NOMAL;
		spa.fly();
		
		spa.land();
	}

}
