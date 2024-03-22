package ch06.sec07.exam04;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();

		Car car2 = new Car("소나타");

		Car car3 = new Car("소나타", "흰색" );
		
		Car car4 = new Car("소나타", "흰색", 250 );
		
		Car car5 = new Car("소나타", "흰색", 250 , "기아" );
		
		System.out.println(car5.company);
		System.out.print(car5.model);

	}

}


