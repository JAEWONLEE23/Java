package ch07.sec10.exam02;

public class AnimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Cat cat = new Cat("한국고양이", "노랑");
		cat.breathe();
		cat.sound();
		cat.catchMouse();
		
		System.out.println();
		Dog dog = new Dog("진돗개", "흰색");
		dog.breathe();
		dog.sound();
		dog.keepHouse();*/
		
		dailyLife(new Cat("한국고양이", "노랑"));
		System.out.println();
		dailyLife(new Dog("진돗개", "흰색"));
	}
	public static void dailyLife(Animal animal) {
		animal.breathe();
		animal.sound();
		
		
		if(animal instanceof Cat cat) {
			cat.catchMouse();
			
		} else if(animal instanceof Dog dog) {
			dog.keepHouse();
		}
			
		
		
		
		
	}
}
