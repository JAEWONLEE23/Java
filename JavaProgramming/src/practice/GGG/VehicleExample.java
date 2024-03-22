package practice.GGG;

public class VehicleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		ride(taxi);
		System.out.println();
		ride(bus);
	
	}
	public static void ride(Vehicle vehicle) {
		if(vehicle instanceof Taxi taxi) {
			taxi.out();
		}
		vehicle.run();
	}

}
