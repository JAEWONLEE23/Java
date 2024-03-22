package ch06.sec07.exam05;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("자가용");
		System.out.println(car1.company);
		System.out.println(car1.modle);
		System.out.println();

		Car car2 = new Car("자가용", "빨강");
		System.out.println(car2.company);
		System.out.println(car2.modle);
		System.out.println(car2.color);

		Car car3 = new Car("자가용", "빨강", 200);
		System.out.println(car3.company);
		System.out.println(car3.modle);
		System.out.println(car3.color);
		System.out.println(car3.maxspeed);
	}

}
