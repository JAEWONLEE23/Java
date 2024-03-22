package ch08.sec11.exam02;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver dr = new Driver();
		
		Bus bus = new Bus();
		dr.drive(bus);
		
		Taxi taxi = new Taxi();
		dr.drive(taxi);
	
		
		
	}
	
}
