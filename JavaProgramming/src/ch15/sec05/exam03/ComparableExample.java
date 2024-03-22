package ch15.sec05.exam03;

import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> treeSet = new TreeSet<>();

		treeSet.add(new Person("홍길동", 25));
		treeSet.add(new Person("김길동", 30));
		treeSet.add(new Person("이길동", 27));
		treeSet.add(new Person("박길동", 28));
		treeSet.add(new Person("로길동", 28));

		for (Person person : treeSet) {
			System.out.println(person.name);
		}
	}

}
