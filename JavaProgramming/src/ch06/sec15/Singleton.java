package ch06.sec15;

public class Singleton { //객체를 만들어서 쓰자 대신 하나만 있어야함.
	//필드선언
	private static Singleton instance = new Singleton(); 
	//생성자 선언
	private  Singleton() {
		
	}
	//메소드 선언
	public static Singleton getInstance() {
		return instance;
	}
}
