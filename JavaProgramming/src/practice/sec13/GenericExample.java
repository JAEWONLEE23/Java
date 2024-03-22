package practice.sec13;

public class GenericExample {
	public static <T extends Number> boolean compare(T t1, T t2) {
		System.out.println("compare(" + t1.getClass().getSimpleName() + "," + t2.getClass().getSimpleName() + ")");

		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();

		return (v1 == v2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result1 = compare(3.4,34.5 );
		System.out.println(result1);
		System.out.println();

		boolean result2 = compare(3.4, 3.4);
		System.out.println(result2);
	}

}
