package ch15.sec05.exam01;

import java.util.*;

public class TreeSetExample {

	public static void main(String[] args) {
		// 컬렉션 생성
		TreeSet<Integer> scores = new TreeSet<>();// <Integer>자동 박싱
		// 객체 저장
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);

		// TreeSet이 가지고 있는 메소드
		System.out.println("가장낮은 점수:" + scores.first());
		System.out.println("가장높은 점수:" + scores.last());
		System.out.println("95점 아래 점수:" + scores.lower(95));
		System.out.println("95점 높은 점수:" + scores.higher(95));
		System.out.println("95점이거나 바로 아래 점수:" + scores.floor(95));
		System.out.println("85점이거나 바로 위에 점수:" + scores.ceiling(85) + "\n");
		System.out.println();
		// 하나의 객체를 올림차순으로 가져오기
		for (int score : scores) {
			System.out.println(score);

		}
		System.out.println();

		// 하나씩 객체를 내림차순으로 가져오기
		for (int score : scores.descendingSet()) {
			System.out.println(score);

		}
		System.out.println();

		// 범위 검색(80 이거나 80 이상) = (80<=)
		for (int score : scores.tailSet(80, true)) {
			System.out.println(score);
		}
		System.out.println();
		// 범위 검색 (80<= score <90)
		for (int score : scores.subSet(80, true, 90, false)) {
			System.out.println(score);
		}
	}

}
