package ch06.sec04;

public class Student {
	public static void main(String[] args) {

		Student s1 = new Student();

		Student s2 = new Student();
		Student s3 = s1;

		if (s1 == s3) {
			System.out.println("같은 객체");
		} else {
			System.out.println("다른 객체");
		}
	}
}
