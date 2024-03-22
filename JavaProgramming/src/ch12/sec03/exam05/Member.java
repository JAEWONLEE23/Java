package ch12.sec03.exam05;

import lombok.*;

@Data
public class Member {
	private  String id;
	private String name; //널이 될수가 없다.
	private int age;
}
