package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컬렉션 생성
		Map<Member, Integer> map = new HashMap<>();
		// 엔트리 저장
		map.put(new Member("홍길동", 25), 50);
		map.put(new Member("홍길동", 25), 60);
		map.put(new Member("홍길동", 25), 70);
		map.put(new Member("홍길동", 25), 80);
		// 저장된 엔트리 수
		System.out.println("총 Entry 수:" + map.size());
		
	}

}
