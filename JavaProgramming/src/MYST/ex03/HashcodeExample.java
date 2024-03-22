package MYST.ex03;

public class HashcodeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1, "lee");
		Student s2 = new Student(1, "lee");

		if (s1.hashCode() == s2.hashCode()) {
			if (s1.equals(s2)) {
				System.out.println("same");
			} else {
				System.out.println("not");
			}
		}
	}

}
