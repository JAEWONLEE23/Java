package practice.go;

public class CCCarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCCar car1 = new CCCar();
		System.out.println("car1.company" + car1.company);
		System.out.println();

		CCCar car2 = new CCCar("gv80");
		System.out.println("car2.company" + car2.company);
		System.out.println("car2.model:" + car2.model);
		
		CCCar car3 = new CCCar("gv80", 300);
		System.out.println("car3.company:" + car3.company);
		System.out.println("car3.model:" + car3.model);
		System.out.println("car3.maxspeed:" + car3.maxspeed);
		
		CCCar car4 = new CCCar("gv80", 300, 50);
		System.out.println("car4.company:" + car4.company);
		System.out.println("car4.model:" + car4.model);
		System.out.println("car4.maxspeed:" + car4.maxspeed);
		System.out.println("car4.speed:" + car4.speed);
		
		CCCar car5 = new CCCar("gv80", 300, 50, "검은색");
		System.out.println("car5.company:" + car5.company);
		System.out.println("car5.model:" + car5.model);
		System.out.println("car5.maxspeed:" + car5.maxspeed);
		System.out.println("car5.color:" + car5.color);

	}
}
