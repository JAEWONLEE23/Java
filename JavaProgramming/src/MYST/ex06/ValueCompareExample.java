package MYST.ex06;

public class ValueCompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==:" + (obj1 == obj2));
		System.out.println("equal():" + (obj1.equals(obj2)));
		System.out.println();

		Integer obj3 = -128;
		Integer obj4 = -128;
		System.out.println("==:" + (obj3 == obj4));
		System.out.println("equal():" + (obj3.equals(obj4)));

	}

}
