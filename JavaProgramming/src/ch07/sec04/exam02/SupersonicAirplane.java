package ch07.sec04.exam02;

public class SupersonicAirplane extends Airplane {
	//Enum 타입 선언
	
	public ch07.sec04.exam02.FlyMode flyMode = FlyMode.NOMAL;

	public void fly() {
		if (flyMode == FlyMode.SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		} else
			super.fly(); // super는 부모를 가르키지만 자식객체안에서만 사용가능

	}
}
