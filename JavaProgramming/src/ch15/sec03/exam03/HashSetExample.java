package ch15.sec03.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// 컬렉션 생성
		Set<String> set = new HashSet<String>();
		// 객체저장
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java"); // 공동 객체는 하나만 저장됨
		set.add("Spring");
		set.add(new String("Java")); // 값이 같기 때문에 동일
		System.out.println("총객체 수:" + set.size());
		// 하나씩 객체가져오기(방법1)
//		for (String item : set) {
//			System.out.println(item);
//		}
//		System.out.println();
		//하나씩 객체 가져오기(방법2)
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String item = iterator.next();
			System.out.println(item);
			if(item.equals("JSP")) {
				iterator.remove();
			}
		}
		System.out.println();
		for (String item : set) {
			System.out.println(item);
		}
		
	}

}
