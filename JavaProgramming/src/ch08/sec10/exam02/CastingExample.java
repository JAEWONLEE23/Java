package ch08.sec10.exam02;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Bus();// 자동타입 변환

		vehicle.run();
		// vehicle.checkFare(); X

		Bus bus = (Bus) vehicle; // 버스로 강제타입 변환
		bus.checkFare();
		bus.run();
	}

}
