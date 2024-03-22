package ch06.sec06.exam02;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		//필드값 읽기
		System.out.println(myCar.company);
		System.out.println(myCar.speed);
		System.out.println(myCar.maxspeed);
		System.out.println(myCar.color);
		System.out.println(myCar.model);
		//메소드 호줄
		myCar.run();
		//필드값 읽기
		System.out.println(myCar.speed);
	}

}
