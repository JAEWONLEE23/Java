package ch06.sec06.exam01;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Car 객체를 생성
		Car myCar = new Car();

		// Car 객체의 필드값 변경
		myCar.model = "그랜져";
		myCar.speed = 60;
		myCar.start = true;

		// Car 객체 내부의 데이터 읽기
		System.out.println("모델명:" + myCar.model);
		System.out.println("시동여부:" + myCar.start);
		System.out.println("속도:" + myCar.speed);

		System.out.println();

		Car yourCar = new Car();

		yourCar.model = "포르쉐";
		yourCar.speed = 123;
		yourCar.start = false;

		System.out.println("모델명:" + yourCar.model);
		System.out.println("시동여부:" + yourCar.start);
		System.out.println("속도:" + yourCar.speed);

	}

}
