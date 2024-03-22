package ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// 컬렉션 생성
		Set<String> set = new HashSet<String>();
		// 객체저장
		set.add("Java");
		set.add("JDBC");
		set.add("JSp");
		set.add("Java"); //공동 객체는 하나만 저장됨
		set.add("Spring");
		set.add(new String("Java")); //값이 같기 때문에 동일
		System.out.println("총객체 수:" + set.size());
	}

}
