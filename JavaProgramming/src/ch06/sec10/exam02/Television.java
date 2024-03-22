package ch06.sec10.exam02;

public class Television {
	// 필드 선언
	static String company = " My Company";//객체마다 가질 필요가 없는 공통 데이터.
	static String model = "LCD";
	static String info; //초기값을 주지 않는다.
	
	static { // 인스턴스 필드가 오면 안된다 정적필드만 와야한다.
		info = company + "-" + model;
		
	}
	// 생성자(constusctor 선언
	
	// 메소드 선언

}
