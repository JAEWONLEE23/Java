package MYST.ex03;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hashSet = new HashSet();

		Student s1 = new Student(1, "lee");
		hashSet.add(s1);
		System.out.println("re:" + hashSet.size());

		Student s2 = new Student(1, "lee");
		hashSet.add(s2);
		System.out.println("re:" + hashSet.size());

		Student s3 = new Student(2, "lee");
		hashSet.add(s3);
		System.out.println("re:" + hashSet.size());

	}

}
