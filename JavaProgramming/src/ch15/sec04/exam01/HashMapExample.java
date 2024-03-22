package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		// 엔트리 저장
		map.put("홍길동", 85);// Integer번지(박싱)가 값으로
		map.put(new String("홍길동"), 90);
		map.put("김자바", 80);
		map.put("동장군", 95);
		// 저장된 엔트리 수
		System.out.println("총 Entry 수:" + map.size());// 홍길동이란 동등한 객체를 갖고있기때문에 수는 3이 나온다.
		System.out.println();
		// 키로 값을 얻기
		String key = "홍길동";
		int value = map.get(key);// 자동 언박싱이 일어난다.
		System.out.println(key + " , " + value);
		System.out.println();

		// 엔트리를 하나씩 가져와서 키와 값을 출력하고싶다.
		for (Entry<String, Integer> entry : map.entrySet()) {// map.entrySet 을 set 컬렉션에 있는 객체를 받으면 올수 있다. (방법1)
			String k = entry.getKey();
			int v = entry.getValue();
			System.out.println(k + " , " + v);

		}
		System.out.println();

		for (String k : map.keySet()) { // 방법2
			int v = map.get(k);
			System.out.println(k + " , " + v);
		}
		System.out.println();

		// 반복 중에 엔트리를 삭제할 경우
		Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();
			String k = entry.getKey();
			int v = entry.getValue();
			if (k.equals("홍길동")) {
				iterator.remove();
			} else {
				System.out.println(k + " , " + v);
				
			}

		}
	}

}
